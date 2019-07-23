package com.fatmawatihospital.messagebox;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // todo 1 deklarasi
    private Button btnToast, btnAlert;
    private TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // todo 2 inisialisasi panggil ID
        btnToast = findViewById(R.id.btn_toast);
        btnAlert = findViewById(R.id.btn_alert);
        txtView = findViewById(R.id.txt_view);

        // todo action button cara , ditampung semua di method onCreate
        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // todo tampilkan toast
                Toast.makeText(MainActivity.this, "Ini sebuah toast", Toast.LENGTH_LONG).show();
            }
        });

        // todo action button cara 2, implements ke View.onClickListener + buat method onClick
        //  + panggil id di method onCLick
        btnAlert.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_alert) {
            // todo tampilkan alert
            // todo, positive negative neutral hanya perbedaan posisi button nya
            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setTitle("Ini alert loh");
            alert.setMessage(R.string.app_name);
            alert.setPositiveButton("YA", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    txtView.setText("ya");
                }
            });
            alert.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    txtView.setText("tidak");
                }
            });
            alert.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    txtView.setText("cancel");
                }
            });
            alert.show();
        }
    }

    // todo action button cara 3, tanpa deklarasi dan inisialisasi ID
    public void actionExit(View view) {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Anda mau finish?");
        alert.setMessage(R.string.app_name);
        alert.setPositiveButton("YA", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        alert.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        alert.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        alert.show();
    }
}
