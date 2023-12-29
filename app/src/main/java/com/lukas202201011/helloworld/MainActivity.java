package com.lukas202201011.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static TextView textView;
    private TextView nama;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button counterButton = findViewById(R.id.buttonTambah);
        Button pindahActivityUTS = findViewById(R.id.buttonUTS);
        textView = findViewById(R.id.textView);
        nama = findViewById(R.id.textView2);

        counterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Increment the counter and update the TextView
                count++;
                tambahAngka();
                Hasil();
            }
        });

        pindahActivityUTS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pindahActivityUTS();
            }
        });
    }

    static void cetak(int a){ textView.append("nilai x:"+a + "\n"); }

    public void Hasil(){
        textView.setText("");
        int x;
        for (x = 0; x < 3; x++){
            cetak(x);
        }
        textView.append("nilai x terakhir: " +x);
    }

    private void tambahAngka() {
        nama.setText("Tambah angka: " + count);
    }

    private void pindahActivityUTS(){
        Intent intent = new Intent(this, UtsActivity.class);
        startActivity(intent);
    }
}