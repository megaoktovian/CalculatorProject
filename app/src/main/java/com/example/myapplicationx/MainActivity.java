package com.example.myapplicationx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button tambah, bagi, kali,kurang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tambah = findViewById(R.id.btn_tambah);
        kurang = findViewById(R.id.btn_kurang);
        bagi = findViewById(R.id.btn_bagi);
        kali = findViewById(R.id.btn_kali);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pagetambah = new Intent(MainActivity.this,TambahActivity.class);
                startActivity(pagetambah);
            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pagekurag = new Intent(MainActivity.this,KurangActivity.class);
                startActivity(pagekurag);
            }
        });
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pagebagi = new Intent(MainActivity.this,BagiActivity.class);
                startActivity(pagebagi);
            }
        });
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pagekali = new Intent(MainActivity.this,KaliActivity.class);
                startActivity(pagekali);
            }
        });
    }
}
