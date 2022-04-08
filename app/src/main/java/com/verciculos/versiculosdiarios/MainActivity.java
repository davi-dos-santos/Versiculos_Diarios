package com.verciculos.versiculosdiarios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView verciculos;
    private Button gerar_verciculos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        verciculos = findViewById(R.id.verciculos);
        gerar_verciculos = findViewById(R.id.gerar_verciculos);

        getSupportActionBar().hide();


    }
}