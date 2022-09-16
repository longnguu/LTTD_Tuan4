package com.example.lttd_tuan4_chuyengd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btchuyen = (Button) findViewById(R.id.buttonChuyen);
        EditText editText = (EditText) findViewById(R.id.edtext);
        btchuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("dulieu",editText.getText().toString());
                startActivity(intent);
            }
        });
    }
}