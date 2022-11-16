package com.example.dialogwindows1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Button(View view) {
        String[] mIngridients = {"TradeOrge", "Binance", "Okex", "Pancaceswap"};
        final boolean[] mSelectedingridients = {false, false, false, false};
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Выбор биржи")
                .setCancelable(false)
                .setIcon(R.drawable.close)
                .setMultiChoiceItems(mIngridients, null, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which, boolean isChecked) {
                        mSelectedingridients[which] = isChecked;
                    }


                })
                .setPositiveButton("OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialogInterface, int id) {
                                //...

                            }


                        });
        AlertDialog alert =builder.create();
        alert.show();
    }}