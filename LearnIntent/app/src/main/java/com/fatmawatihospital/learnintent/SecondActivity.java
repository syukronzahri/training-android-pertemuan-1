package com.fatmawatihospital.learnintent;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    // todo key untuk mengirim dan menerima data
    public static String KEY_NAMA = "key_nama";
    public static String KEY_UMUR = "key_umur";
    private TextView txtTerimaData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txtTerimaData = findViewById(R.id.txt_terima_data);

        // todo terima data dari intent dari MainActivity
        Intent intent = getIntent();
        String nama = intent.getStringExtra(KEY_NAMA);
        int umur = intent.getIntExtra(KEY_UMUR, 1);

        // todo tampilkan di textView
        txtTerimaData.setText("Nama : " + nama + "\n" + "Umur : " + umur);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
