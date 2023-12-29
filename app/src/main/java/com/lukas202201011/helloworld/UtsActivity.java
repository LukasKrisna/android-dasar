package com.lukas202201011.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class UtsActivity extends AppCompatActivity {

    static TextView hasilText;
    static EditText angkaText;
    static Button tombolHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uts);

        hasilText = findViewById(R.id.textView);
        angkaText = findViewById(R.id.editTextNumber);
        tombolHasil = findViewById(R.id.button);

        tombolHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Hasil();
            }
        });
    }

    public void Hasil(){
        int hasil;
        int angka_hasil;
        angka_hasil = Integer.parseInt(String.valueOf(angkaText.getText()));
        hasil = angka_hasil * angka_hasil;
        hasilText.setText(angka_hasil + " kuadrat adalah: " + hasil);
    }
}