package com.lukas202201011.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IntentForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_form);

        EditText mEditTextNama = findViewById(R.id.editTextNama);
        EditText mEditTextNIM = findViewById(R.id.editTextNIM);
        Button mButtonKirim = findViewById(R.id.buttonKirimIntentForm);

        mButtonKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = mEditTextNama.getText().toString();
                String nim = mEditTextNIM.getText().toString();

                Intent intent = new Intent(IntentForm.this, IntentFormResult.class);
                intent.putExtra("NAMA", name);
                intent.putExtra("NIM", nim);
                startActivity(intent);
            }
        });
    }
}