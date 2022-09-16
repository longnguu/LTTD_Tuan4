package com.example.lttd_tuan4_chuyengd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i = getIntent();
        TextView textView = (TextView) findViewById(R.id.edtext2);
        textView.setText(i.getStringExtra("dulieu"));
    }
}