package com.evadts.aknesol.evadts;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView edtEvaDts;
    Button btPaste;
    Button btPrelucreaza;
    private ClipboardManager myClipboard;
    private ClipData myClip;
    private static final String FILE_NAME = "eva.txt";
    AlertDialog.Builder builer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtEvaDts = (TextView) findViewById(R.id.editEvaDts);
        btPaste = (Button) findViewById(R.id.btPaste);
        myClipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
        btPrelucreaza = (Button) findViewById(R.id.btPrelucreaza);
        if (myClipboard.hasPrimaryClip()) {
            btPaste.setEnabled(true);
        }

        btPaste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pasteEvaDts();
            }
        });

        btPrelucreaza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });
    }

    public void openActivity2() {
        try {
            myClip = myClipboard.getPrimaryClip();
            ClipData.Item item = myClip.getItemAt(0);
            String textPaste = item.getText().toString();
            if (textPaste.contains("DXS")) {


                String text = edtEvaDts.getText().toString();
                text = text.replaceAll("\\*", "\\* ");

                String str[] = text.split("-");

                Intent intent = new Intent(this, Main2Activity.class);
                intent.putExtra("textEva", text);

                startActivity(intent);

            } else {
                builer = new AlertDialog.Builder(MainActivity.this);
                builer.setMessage("This is not EVA-DTS code");
                builer.setCancelable(true);
                AlertDialog alertNotPaste = builer.create();
                alertNotPaste.show();
            }

        } catch (
                Exception e)

        {
            Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_LONG).show();

        }

    }

    private void pasteEvaDts() {
        try {
            myClip = myClipboard.getPrimaryClip();
            ClipData.Item item = myClip.getItemAt(0);
            String text = item.getText().toString();
            if (text.contains("DXS")) {
                edtEvaDts.setText(text);
            } else {
                builer = new AlertDialog.Builder(MainActivity.this);
                builer.setMessage("This is not EVA-DTS code");
                builer.setCancelable(true);
                AlertDialog alertNotPaste = builer.create();
                alertNotPaste.show();
            }

        } catch (Exception e) {
            Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_LONG).show();

        }
    }

}
