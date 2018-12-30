package com.evadts.aknesol.evadts;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class TabVend extends Fragment {
    RecyclerView recyclerView;
    VendListAdapter adapter;

    List<VendMachine> vendMachinesList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View myview = inflater.inflate(R.layout.tab_preturi, container, false);
        Bundle bundle = getActivity().getIntent().getExtras();
        vendMachinesList = new ArrayList<>();

        recyclerView = (RecyclerView) myview.findViewById(R.id.recyclerViewVend);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));

        adapter = new VendListAdapter(getActivity(), ListVend(bundle));

        try {
            recyclerView.setAdapter(adapter);
        } catch (Exception e) {
            Toast.makeText(getActivity(), e.getMessage(), Toast.LENGTH_LONG).show();
        }
        return myview;


    }

    private List<VendMachine> ListVend(Bundle bundle) {
        List<VendMachine> list = new ArrayList<>();
        String evadts = bundle.getString("textEva");
        Scanner scanner = new Scanner(evadts);
        //     String[] itr = scanner.nextLine().split("\\*");
        String vendSn = new String();
        String vendModel = new String();
        String vendBuildStd = new String();
        String vendLocation = new String();
        String vendUserDefined = new String();
        String vendAssetNumber = new String();
        String vendDecimalPoint = new String();
        String vendType = new String();

        String boardSn = new String();
        String boardModel = new String();
        String boardSoftRev = new String();

        String billSn = new String();
        String billModel = new String();
        String billSoftRev = new String();

        String coinSn = new String();
        String coinModel = new String();
        String coinSoftRev = new String();

        String systemDate = new String();
        String systemTime = new String();

        try {

            while (scanner.hasNextLine()) {

                String[] items = scanner.nextLine().split("\\*");
                String id = items[0];

                if (id.equals("ID1")) {
                    vendSn = itemVerif(items[1]).replaceAll("NEC", "\n");
                    vendModel = itemVerif(items[2]);
                    vendBuildStd = itemVerif(items[3]);
                    vendLocation = itemVerif(items[4]);
                    vendUserDefined = itemVerif(items[5]);
                    vendAssetNumber = itemVerif(items[6]);


                } else if (id.equals("ID4")) {
                    vendDecimalPoint = itemVerif(items[1]);
                } else if (id.equals("MA1")) {
                    vendType = itemVerif(items[2]);
                } else if (id.equals("CB1")) {
                    boardSn = itemVerif(items[1]);
                    boardModel = itemVerif(items[2]);
                    boardSoftRev = itemVerif(items[3]);
                } else if (id.equals("BA1")) {
                    billSn = itemVerif(items[1]);
                    billModel = itemVerif(items[2]);
                    billSoftRev = itemVerif(items[3]);
                } else if (id.equals("CA1")) {
                    coinSn = itemVerif(items[1]);
                    coinModel = itemVerif(items[2]);
                    coinSoftRev = itemVerif(items[3]);
                } else if (id.equals("ID5")) {
                    DateFormat formatterParse = new SimpleDateFormat("yyMMdd");
                    DateFormat formatterEx = new SimpleDateFormat("dd.MM.yyyy");

                    DateFormat formattimeParse = new SimpleDateFormat("hhmmss");
                    DateFormat formattimeEx = new SimpleDateFormat("HH:mm:ss");
                    try {
                        Date dateTime = formatterParse.parse(items[1].replaceAll(" ", ""));
                        systemDate = formatterEx.format(dateTime);

                        Date time = formattimeParse.parse(items[2].replaceAll(" ", ""));
                        systemTime = formattimeEx.format(time);

                    } catch (ParseException e) {
                        Toast.makeText(getActivity(), e.getMessage(), Toast.LENGTH_LONG).show();
                    }


                    //systemDate = items[1];
                    //systemTime = itemVerif(items[2]);
                }
            }


            list.add(new VendMachine(
                    "Machine serial n.: " + vendSn.trim(),
                    "Model name: " + vendModel,
                    "Build standard: " + vendBuildStd,
                    "Location: " + vendLocation,
                    "User defined data: " + vendUserDefined,
                    "Asset number: " + vendAssetNumber,
                    "Decimal point: " + vendDecimalPoint,
                    "Single/Multi vend: " + vendType,
                    "System date: " + systemDate,
                    "System time: " + systemTime,
                    " Board serial number: " + boardSn,
                    "Board model: " + boardModel,
                    "Board soft revision: " + boardSoftRev,
                    "Coin mechanism serial n.: " + coinSn,
                    "Coin mechanism model: " + coinModel,
                    "Coin mechanism soft r.: " + coinSoftRev,
                    "Bill validator serial n.: " + billSn,
                    "Bill validator model: " + billModel,
                    "Bill validator soft r.: " + billSoftRev
            ));
        } catch (
                Exception e)

        {
            Toast.makeText(getActivity(), e.getMessage(), Toast.LENGTH_LONG).show();
        }
/*
        ArrayList<String> text = bundle.getStringArrayList("listEva");
        for (String s : text) {
            if (s.contains("Info ")) {
                int r = text.indexOf(s);
                r++;
                list.add(new VendMachine(
                        "Matricola: " + s,
                        "Model: " + text.get(r),
                        "Build Standard: " + text.get(r + 1),
                        "Location: " + text.get(r + 2),
                        "ss",
                        "sds",
                        2,
                        "sdsd",
                        "sdsd",
                        "sdds", " sdsd",
                        "sdsd",
                        "dfdfdf",
                        "sfd", "sdsd"
                        , "sdsd", "sdsd", "sfds", "sfdsf"
                ));

            }
        }
*/
        return list;
    }

    private String itemVerif(String item) {
        if (item.length() < 2) {
            item = "<font color=#ff0000>unknown</font>";
            return item;
        }
        return "<b><font color=black>" + item + "</font></b>";
    }
}
