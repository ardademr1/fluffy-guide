package com.example.fluffy_guide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String adSoyad = getIntent().getStringExtra("AdSoyad");
        TextView textView2;
        textView2 = findViewById(R.id.textView2);
        textView2.setText("hoşgeldin " + adSoyad);
    }
}
