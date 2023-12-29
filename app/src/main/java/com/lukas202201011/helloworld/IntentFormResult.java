package com.lukas202201011.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class IntentFormResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_form_result);

        TextView mResultTextView = findViewById(R.id.textViewResult);

        Intent intent = getIntent();
        String nama = intent.getStringExtra("NAMA");
        String nim = intent.getStringExtra("NIM");

        mResultTextView.setText("Nama: " + nama + "\nNIM: " + nim);
    }
}