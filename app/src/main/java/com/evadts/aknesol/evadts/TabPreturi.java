package com.evadts.aknesol.evadts;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Layout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TableRow.LayoutParams;
import android.widget.TextView;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class TabPreturi extends Fragment {

    private static final String FILE_NAME = "eva.txt";

    @Nullable
    @Override


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View myview = inflater.inflate(R.layout.tab_preturi, container, false);

    return myview;


    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private void Verif(ArrayList<String> substr) {

       /* table.removeAllViewsInLayout();
        table.addView(headRow);
        for (String s : substr) {
            if (s.contains("Selectia ")) {
                int r = substr.indexOf(s);
                TableRow tbR = new TableRow(getActivity());
                tbR.setLayoutParams(new TableRow.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
                tbR.setGravity(Gravity.CENTER);

                //TextView Selectie Numar
                TextView selNo = new TextView(getActivity());
                selNo.setBackground(getResources().getDrawable(R.drawable.border));
                selNo.setGravity(Gravity.CENTER);
                int sel = Integer.parseInt(s.replaceAll("[\\D]", ""));
                selNo.setText("" + sel + "");
                tbR.addView(selNo);

                //TextView Pret
                TextView pret = new TextView(getActivity());
                r++;
                pret.setGravity(Gravity.CENTER);
                //      double pretDouble = String.format("%.2f",Double.parseDouble(substr.get(r)));
                pret.setText(String.format("%.2f", Double.parseDouble(substr.get(r)) / 100) + " Lei");
                pret.setBackground(getResources().getDrawable(R.drawable.border_pret));
                tbR.addView(pret);

                table.addView(tbR);

            }


        }*/
    }


}