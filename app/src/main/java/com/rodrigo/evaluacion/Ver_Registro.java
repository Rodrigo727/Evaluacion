package com.rodrigo.evaluacion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


public class Ver_Registro extends AppCompatActivity {


    RecyclerView rvRegistros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver__registro);
        rvRegistros = findViewById(R.id.rvRegistros);
        rvRegistros.setLayoutManager(new LinearLayoutManager(this));
        MiAdaptador adapter = new MiAdaptador(this,Generar_Registro.listaAuto);
        rvRegistros.setAdapter(adapter);
    }
}