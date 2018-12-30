package com.evadts.aknesol.evadts;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

public class SettingsActivity extends Main2Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_settings);
        try {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarActivitySettings);
        setSupportActionBar(toolbar);

            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }catch (Exception e){
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
        }

    }
}
