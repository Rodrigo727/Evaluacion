package com.rodrigo.evaluacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;

import java.util.ArrayList;

public class Generar_Registro extends AppCompatActivity {

    Spinner spTipo;
    Button btnAceptar;
    EditText txtMarca , txtModelo;
    RatingBar ratingbar;
    RadioGroup rbGrupo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generar__registro);
        spTipo = findViewById(R.id.spTipo);
        btnAceptar = findViewById(R.id.btnAceptar);
        txtMarca = findViewById(R.id.txtMarca);
        txtModelo = findViewById(R.id.txtModelo);
        ratingbar = findViewById(R.id.ratingBar);
        rbGrupo = findViewById(R.id.rbGrupo);

        ArrayList<String> tipo = new ArrayList<>();
        tipo.add("Sedan");
        tipo.add("Station Wagon");
        tipo.add("Deportivo");
        tipo.add("Todo Terreno");
        ArrayAdapter<String> adaptador = new ArrayAdapter<>(Generar_Registro.this,
                android.R.layout.simple_spinner_item,tipo);

        spTipo.setAdapter(adaptador);


        rbGrupo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rbSi){
                    ratingbar.setEnabled(true);
                }else{
                    ratingbar.setRating(0);
                    ratingbar.setEnabled(false);
                }
            }
        });
    }
}