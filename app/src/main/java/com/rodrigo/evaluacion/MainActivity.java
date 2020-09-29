package com.rodrigo.evaluacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnGRegistro , btnVRegistro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGRegistro = findViewById(R.id.btnGRegistro);
        btnVRegistro = findViewById(R.id.btnVRegistro);

        btnGRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento = new Intent(MainActivity.this, Generar_Registro.class);
                startActivity(intento);
            }
        });

        btnVRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento = new Intent(MainActivity.this, Ver_Registro.class);
                startActivity(intento);
            }
        });
    }
}