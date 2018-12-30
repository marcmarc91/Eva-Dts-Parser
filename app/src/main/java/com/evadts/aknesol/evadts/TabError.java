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

public class TabError extends Fragment {
    RecyclerView recyclerViewError;
    ErrorListAdapter adapterError;
    ErrorList errorList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View myview = inflater.inflate(R.layout.tab_erori, container, false);
        Bundle bundle = getActivity().getIntent().getExtras();
        recyclerViewError = (RecyclerView) myview.findViewById(R.id.recyclerViewError);
        recyclerViewError.setHasFixedSize(true);

        recyclerViewError.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));

        ListError(bundle);
        return myview;


    }

    private void ListError(Bundle bundle) {
        List<Error> listError = new ArrayList<>();
        String evadts = bundle.getString("textEva");
        Scanner scanner = new Scanner(evadts);

        String eventCode = new String();
        String eventDate = new String();

        try {
            do {
                String[] items = scanner.nextLine().split("\\*");
                String id = items[0];
                if (id.equals("EA1")) {
                    eventCode = String.valueOf(items[1].trim());
                    errorList = new ErrorList(eventCode);
                    DateFormat formatterParse = new SimpleDateFormat("yyMMdd");
                    DateFormat formatterEx = new SimpleDateFormat("dd.MM.yyyy");

                    DateFormat formattimeParse = new SimpleDateFormat("hhmmss");
                    DateFormat formattimeEx = new SimpleDateFormat("HH:mm:ss");
                    try {
                        Date dateTime = formatterParse.parse(items[2].trim());
                        String systemDate = formatterEx.format(dateTime);

                        Date time = formattimeParse.parse(items[3].trim());
                        String systemTime = formattimeEx.format(time);
                        eventDate = "Date of event: " + systemDate + " " + systemTime;
                    } catch (ParseException e) {
                        //  Toast.makeText(getActivity(), e.getMessage(), Toast.LENGTH_LONG).show();
                    }
                    listError.add(new Error(

                            errorList.getEventDescription(),
                            errorList.getEventCode(),
                            eventDate,
                            errorList.getEventDefinition()
                    ));
                }

            } while (scanner.hasNextLine());

        } catch (Exception e)

        {
            Toast.makeText(getActivity(), e.getMessage(), Toast.LENGTH_LONG).show();
        }

        adapterError = new ErrorListAdapter(getActivity(), listError);

        try {
            recyclerViewError.setAdapter(adapterError);
        } catch (
                Exception e)

        {
            Toast.makeText(getActivity(), e.getMessage(), Toast.LENGTH_LONG).show();
        }

    }


}
