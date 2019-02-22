package com.example.myapplicationx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BagiActivity extends AppCompatActivity {  EditText angka1;
    EditText angka2;
    Button hasil;
    TextView jumlah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bagi);
        angka1 = findViewById(R.id.angka1);
        angka2 = findViewById(R.id.angka2);
        hasil = findViewById(R.id.btn_tambah);
        jumlah = findViewById(R.id.tv_tambahhasil);

        hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double hasiljumlah = Double.parseDouble(angka1.getText().toString()) / Double.parseDouble(angka2.getText().toString());
                jumlah.setText(String.valueOf(hasiljumlah));

            }
        });
    }
}
