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
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class TabSelectii extends Fragment {
    RecyclerView recyclerViewTotal;
    RecyclerView recyclerViewSelection;
    SelectionListAdapter adapterTotal;
    SelectionListAdapter adapterSelection;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View myview = inflater.inflate(R.layout.tab_selectii, container, false);
        Bundle bundle = getActivity().getIntent().getExtras();
        recyclerViewTotal = (RecyclerView) myview.findViewById(R.id.recyclerView);
        recyclerViewSelection = (RecyclerView) myview.findViewById(R.id.recyclerView1);
        recyclerViewTotal.setHasFixedSize(true);
        recyclerViewSelection.setHasFixedSize(true);

        recyclerViewTotal.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        recyclerViewSelection.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        recyclerViewTotal.setNestedScrollingEnabled(false);
        recyclerViewSelection.setNestedScrollingEnabled(false);

        ListSelection(bundle);
        return myview;


    }

    private void ListSelection(Bundle bundle) {
        List<Selection> listTotal = new ArrayList<>();
        List<Selection> listSelection = new ArrayList<>();
        Locale ro = new Locale("ro", "RO");
        String evadts = bundle.getString("textEva");
        Scanner scanner = new Scanner(evadts);

        String productAll = "";
        String thisRead = "";
        String lastRead = new String();
        String nrOfRead = new String();

        int productNumber = 0;
        double productPrice = 0;
        String productName = new String();
        String productStatus = new String();

        int paidCountLast = 0;
        Double paidValueLast = 0.0;
        int paidCountInit = 0;
        Double paidValueInit = 0.0;

        int testCountLast = 0;
        Double testValueLast = null;
        int testCountInit = 0;
        Double testValueInit = null;

        int freeCountLast = 0;
        Double freeValueLast = null;
        int freeCountInit = 0;
        Double freeValueInit = null;

        String recentSale = " ";
        Boolean completeAll = false;
        Boolean completeSel = false;
 /*       while (scanner.hasNextLine()){
            String[] line = scanner.nextLine().split("\\*");
            String id = line[0];


        if (id.equals("PA5")) {
            Toast.makeText(getActivity(), "ESTE", Toast.LENGTH_LONG).show();
        }



        }*/
        try {

            do {

                String[] items = scanner.nextLine().split("\\*");
                String id = items[0];
                if (!completeAll) {
                    switch (id) {
                        case "VA1":

                            productAll = "ALL";
                            //  productPrice = Double.parseDouble(items[2].trim()) / 100;
                            productName = "Vending Sales Summary - All Sources";
                            productStatus = "";

                            paidValueInit = Double.valueOf(items[1].trim()) / 100;
                            paidCountInit = Integer.parseInt(items[2].trim());
                            paidCountLast = Integer.parseInt(items[4].trim());
                            paidValueLast = Double.valueOf(items[3].trim()) / 100;

                            break;
                        case "VA2":
                            testCountInit = Integer.parseInt(items[2].trim());
                            testValueInit = Double.valueOf(valueVerif(items[1].trim())) / 100;
                            testCountLast = Integer.parseInt(items[4].trim());
                            testValueLast = Double.valueOf(valueVerif(items[3].trim())) / 100;

                            break;
                        case "VA3":
                            freeCountInit = Integer.parseInt(items[2].trim());
                            freeValueInit = Double.valueOf(valueVerif(items[1].trim())) / 100;
                            freeCountLast = Integer.parseInt(items[4].trim());
                            freeValueLast = Double.valueOf(valueVerif(items[3].trim())) / 100;

                            productName = "C.G.: *"+"<b><font color=#FF211A>"+String.valueOf(paidCountLast+testCountLast+freeCountLast)+"</font>"+"* Vending Sales Summary - All Sources";
                           // productAll = String.valueOf(paidCountLast+testCountLast+freeCountLast);
                            break;
                        case "EA3":
                            DateFormat formatterParse = new SimpleDateFormat("yyMMdd");
                            DateFormat formatterEx = new SimpleDateFormat("dd.MM.yyyy");

                            DateFormat formattimeParse = new SimpleDateFormat("hhmmss");
                            DateFormat formattimeEx = new SimpleDateFormat("HH:mm:ss");
                            try {
                                Date dateTimethis = formatterParse.parse(items[2].trim());
                                String systemDatethis = formatterEx.format(dateTimethis);
                                Date timethis = formattimeParse.parse(items[3].trim());
                                String systemTimethis = formattimeEx.format(timethis);
                                thisRead = "This read out: " + systemDatethis + " " + systemTimethis;

                                Date dateTimelast = formatterParse.parse(items[5].trim());
                                String systemDatelast = formatterEx.format(dateTimelast);
                                Date timelast = formattimeParse.parse(items[6].trim());
                                String systemTimelast = formattimeEx.format(timelast);
                                lastRead = "Last read out: " + systemDatelast + " " + systemTimelast;


                            } catch (ParseException e) {
                                //  Toast.makeText(getActivity(), e.getMessage(), Toast.LENGTH_LONG).show();
                            }
                            completeAll = true;
                            break;
                    }
                } else {
                    listTotal.add(new Selection(
                            productAll,
                            thisRead,
                            productName,
                            String.valueOf(productStatus),
                            String.valueOf(paidCountLast),
                            NumberFormat.getCurrencyInstance(ro).format(paidValueLast),
                            String.valueOf(paidCountInit),
                            NumberFormat.getCurrencyInstance(ro).format(paidValueInit),
                            String.valueOf(testCountLast),
                            NumberFormat.getCurrencyInstance(ro).format(testValueLast),
                            String.valueOf(testCountInit),
                            NumberFormat.getCurrencyInstance(ro).format(testValueInit),
                            String.valueOf(freeCountLast),
                            NumberFormat.getCurrencyInstance(ro).format(freeValueLast),
                            String.valueOf(freeCountInit),
                            NumberFormat.getCurrencyInstance(ro).format(freeValueInit),
                            lastRead


                    ));
                    completeAll = false;
                }

                //     if (!completeSel) {
                String[] verifyPA1 = items;
                while (verifyPA1[0].equals("PA1")) {
                    if (verifyPA1.length < 1) {

                        productNumber = Integer.parseInt(items[1].trim());
                        productPrice = Double.parseDouble(items[2].trim()) / 100;
                        productName = items[3].trim();
                        productStatus = statusVerif(items);

                    } else {
                        productNumber = Integer.parseInt(verifyPA1[1].trim());
                        productPrice = Double.parseDouble(verifyPA1[2].trim()) / 100;
                        productName = verifyPA1[3].trim();
                        productStatus = statusVerif(verifyPA1);

                    }
                    String[] verifyPA2 = scanner.nextLine().split("\\*");
                    String[] verifyPA3 = new String[0];
                    String[] verifyPA4 = new String[0];
                    String[] verifyPA5 = new String[0];
                    String[] verifyPA6 = new String[0];
                    String[] verifyPA7 = new String[0];
                    String[] verifyPA8 = new String[0];
                    if (verifyPA2[0].equals("PA2")) {
                        paidCountInit = Integer.parseInt(verifyPA2[1].trim());
                        paidValueInit = Double.valueOf(verifyPA2[2].trim()) / 100;
                        paidCountLast = Integer.parseInt(verifyPA2[3].trim());
                        paidValueLast = Double.valueOf(verifyPA2[4].trim()) / 100;
                        verifyPA3 = scanner.nextLine().split("\\*");
                    }
                    if (verifyPA3[0].equals("PA3")) {
                        testCountInit = Integer.parseInt(verifyPA3[1].trim());
                        testValueInit = Double.valueOf(valueVerif(verifyPA3[2].trim())) / 100;
                        testCountLast = Integer.parseInt(verifyPA3[3].trim());
                        testValueLast = valueExist(verifyPA3);
                        verifyPA4 = scanner.nextLine().split("\\*");
                    }
                    if (verifyPA4[0].equals("PA4")) {

                        freeCountInit = Integer.parseInt(verifyPA4[1].trim());
                        freeValueInit = Double.valueOf(valueVerif(verifyPA4[2].trim())) / 100;
                        freeCountLast = Integer.parseInt(verifyPA4[3].trim());
                        freeValueLast = valueExist(verifyPA4);
                        completeSel = true;
                        verifyPA5 = scanner.nextLine().split("\\*");
                        verifyPA1 = verifyPA5;
                    }
                    if (verifyPA5[0].equals("PA5")) {

                        DateFormat formatterParse = new SimpleDateFormat("yyMMdd");
                        DateFormat formatterEx = new SimpleDateFormat("dd.MM.yyyy");

                        DateFormat formattimeParse = new SimpleDateFormat("hhmmss");
                        DateFormat formattimeEx = new SimpleDateFormat("HH:mm:ss");
                        try {
                            Date dateTime = formatterParse.parse(verifyPA5[1].trim());
                            String systemDate = formatterEx.format(dateTime);

                            Date time = formattimeParse.parse(verifyPA5[2].trim());
                            String systemTime = formattimeEx.format(time);
                            recentSale = "Sold out: " + systemDate + " " + systemTime;
                        } catch (ParseException e) {
                            //  Toast.makeText(getActivity(), e.getMessage(), Toast.LENGTH_LONG).show();
                        }

                        completeSel = true;
                        verifyPA6 = scanner.nextLine().split("\\*");
                        verifyPA1 = verifyPA6;

                    }
                    if (verifyPA6.length > 2 && verifyPA6[0].equals("PA6")) {
                        verifyPA7 = scanner.nextLine().split("\\*");
                        verifyPA1 = verifyPA7;
                    }
                    if (verifyPA7.length > 2 &&verifyPA7[0].equals("PA7")) {
                        verifyPA8 = scanner.nextLine().split("\\*");
                        verifyPA1 = verifyPA8;
                    }
                  if (verifyPA8.length > 2 && verifyPA8[0].equals("PA8")) {
                        verifyPA1 = scanner.nextLine().split("\\*");
                    }

                    listSelection.add(new Selection(
                            String.valueOf(productNumber),
                            "Price: " + NumberFormat.getCurrencyInstance(ro).format(productPrice),
                            "Product name: " + productName,
                            "Status:\n" + String.valueOf(productStatus),
                            String.valueOf(paidCountLast),
                            NumberFormat.getCurrencyInstance(ro).format(paidValueLast),
                            String.valueOf(paidCountInit),
                            NumberFormat.getCurrencyInstance(ro).format(paidValueInit),
                            String.valueOf(testCountLast),
                            NumberFormat.getCurrencyInstance(ro).format(testValueLast),
                            String.valueOf(testCountInit),
                            NumberFormat.getCurrencyInstance(ro).format(testValueInit),
                            String.valueOf(freeCountLast),
                            NumberFormat.getCurrencyInstance(ro).format(freeValueLast),
                            String.valueOf(freeCountInit),
                            NumberFormat.getCurrencyInstance(ro).format(freeValueInit),
                            recentSale
                    ));
                }

        /*        } else {

            /*        listSelection.add(new Selection(
                            String.valueOf(productNumber),
                            "Price: " + NumberFormat.getCurrencyInstance(ro).format(productPrice),
                            "Product name: " + productName,
                            "Status:\n" + String.valueOf(productStatus),
                            String.valueOf(paidCountLast),
                            NumberFormat.getCurrencyInstance(ro).format(paidValueLast),
                            String.valueOf(paidCountInit),
                            NumberFormat.getCurrencyInstance(ro).format(paidValueInit),
                            String.valueOf(testCountLast),
                            NumberFormat.getCurrencyInstance(ro).format(testValueLast),
                            String.valueOf(testCountInit),
                            NumberFormat.getCurrencyInstance(ro).format(testValueInit),
                            String.valueOf(freeCountLast),
                            NumberFormat.getCurrencyInstance(ro).format(freeValueLast),
                            String.valueOf(freeCountInit),
                            NumberFormat.getCurrencyInstance(ro).format(freeValueInit),
                            recentSale
                    ));
                    completeSel = false;
            }
*/
            } while (scanner.hasNextLine());
        } catch (
                Exception e)

        {
            Toast.makeText(getActivity(), e.getMessage(), Toast.LENGTH_LONG).show();
        }

        adapterTotal = new

                SelectionListAdapter(getActivity(), listTotal, R.drawable.background_card_total);
        adapterSelection = new

                SelectionListAdapter(getActivity(), listSelection, R.drawable.background_card_selection);
        try

        {

            recyclerViewTotal.setAdapter(adapterTotal);
            recyclerViewSelection.setAdapter(adapterSelection);


        } catch (
                Exception e)

        {
            Toast.makeText(getActivity(), e.getMessage(), Toast.LENGTH_LONG).show();
        }

    }

    private String itemVerif(String item) {
        if (item.length() < 2) {
            item = "<font color=#ff0000>unknown</font>";
            return item;
        }
        return "<b><font color=black>" + item + "</font></b>";
    }

    private String statusVerif(String[] item) {

        if (item.length <= 8) {
            String status = item[7];
            if (Integer.parseInt(status.trim()) == 1) {
                status = "<font color=#05f621>Active</font>";
                return status;
            }
            return "<b><font color=#FF211A>Inactive</font>";
        } else {
            String status = item[6];
            if (Integer.parseInt(status.trim()) == 1) {
                status = "<font color=#05f621>Active</font>";
                return status;
            }
            return "<b><font color=#FF211A>Inactive</font>";
        }
    }

    private String valueVerif(String item) {
        if (item.length() < 1 || item == null) {
            item = "0.0";
            return item;
        }
        return item;
    }

    private Double valueExist(String[] items) {
        if (items.length < 5) {
            return 0.0;
        } else {
            return Double.valueOf(valueVerif(items[4].trim())) / 100;
        }
    }

   /* private void verifyPA(Scanner scanne,){
        String[] lineScanner = scanner.nextLine().split("\\*");
        String firstWord = lineScanner[0];
        if (firstWord.equals("PA1")) {
            productNumber = Integer.parseInt(items[1].trim());
            productPrice = Double.parseDouble(items[2].trim()) / 100;
            productName = items[3].trim();
            productStatus = statusVerif(items);
            String[] verifyPA2 = scanner.nextLine().split("\\*");
            String[] verifyPA3 = new String[0];
            String[] verifyPA4 = new String[0];
            String[] verifyPA5 = new String[0];
            if (verifyPA2[0].equals("PA2")) {
                paidCountInit = Integer.parseInt(verifyPA2[1].trim());
                paidValueInit = Double.valueOf(verifyPA2[2].trim()) / 100;
                paidCountLast = Integer.parseInt(verifyPA2[3].trim());
                paidValueLast = Double.valueOf(verifyPA2[4].trim()) / 100;
                verifyPA3 = scanner.nextLine().split("\\*");
            } if (verifyPA3[0].equals("PA3")) {
                testCountInit = Integer.parseInt(verifyPA3[1].trim());
                testValueInit = Double.valueOf(valueVerif(verifyPA3[2].trim())) / 100;
                testCountLast = Integer.parseInt(verifyPA3[3].trim());
                testValueLast = valueExist(verifyPA3);
                verifyPA4 = scanner.nextLine().split("\\*");
            }  if (verifyPA4[0].equals("PA4")) {

                freeCountInit = Integer.parseInt(verifyPA4[1].trim());
                freeValueInit = Double.valueOf(valueVerif(verifyPA4[2].trim())) / 100;
                freeCountLast = Integer.parseInt(verifyPA4[3].trim());
                freeValueLast = valueExist(verifyPA4);
                verifyPA5 = scanner.nextLine().split("\\*");
            }  if (verifyPA5[0].equals("PA5")) {


                DateFormat formatterParse = new SimpleDateFormat("yyMMdd");
                DateFormat formatterEx = new SimpleDateFormat("dd.MM.yyyy");

                DateFormat formattimeParse = new SimpleDateFormat("hhmmss");
                DateFormat formattimeEx = new SimpleDateFormat("HH:mm:ss");
                try {
                    Date dateTime = formatterParse.parse(verifyPA5[1].trim());
                    String systemDate = formatterEx.format(dateTime);

                    Date time = formattimeParse.parse(verifyPA5[2].trim());
                    String systemTime = formattimeEx.format(time);
                    recentSale = "Sold out: " + systemDate + " " + systemTime;
                } catch (ParseException e) {
                    //  Toast.makeText(getActivity(), e.getMessage(), Toast.LENGTH_LONG).show();
                }

            } else {

                completeSel = true;
                return;

            }
        }
    }*/

}
