package com.fatmawatihospital.learnintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // todo intent ke activity lain
    // todo intent ke aplikasi android yang lain dengan kirim data ke dial phone
    // todo intent ke activity lain dengan membawa data

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pindahActivity(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }

    public void pindahAplikasiDgnData(View view) {
//        Intent intent = new Intent(Intent.ACTION_DIAL);
//        intent.setData(Uri.parse("tel:089635604086"));
//        startActivity(intent);

//        Uri uri = Uri.parse("smsto:" + "+6289622616425");
//        Intent sendIntent = new Intent(Intent.ACTION_SENDTO, uri);
//        sendIntent.setPackage("com.whatsapp");
//        startActivity(sendIntent);

        Uri uri = Uri.parse("smsto: " + "+6289622616425");

    }

    public void pindahActivityDgnData(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra(SecondActivity.KEY_NAMA, "Syukron Zahri");
        intent.putExtra(SecondActivity.KEY_UMUR, 29);
        startActivity(intent);
    }
}
