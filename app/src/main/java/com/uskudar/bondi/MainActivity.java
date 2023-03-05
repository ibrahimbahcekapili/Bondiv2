package com.uskudar.bondi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("Merhaba Türkiye");
        System.out.println("Serhat ÖZEKES galp");
        System.out.println("Mayıslar Bizimdir");
    }
}