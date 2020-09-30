package com.rodrigo.evaluacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.mbms.StreamingServiceInfo;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class Generar_Registro extends AppCompatActivity {

    Spinner spTipo;
    Button btnAceptar;
    EditText txtMarca , txtModelo;
    RatingBar ratingbar;
    CheckBox checkBox;
    private boolean MarcaOk = false;
    private boolean ModeloOK = false;
    static ArrayList<Auto> listaAuto = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generar__registro);
        spTipo = findViewById(R.id.spTipo);
        btnAceptar = findViewById(R.id.btnAceptar);
        txtMarca = findViewById(R.id.txtMarca);
        txtModelo = findViewById(R.id.txtModelo);
        ratingbar = findViewById(R.id.ratingBar);
        checkBox = findViewById(R.id.checkBox);

        ArrayList<String> tipo = new ArrayList<>();
        tipo.add("Sedan");
        tipo.add("Station Wagon");
        tipo.add("Deportivo");
        tipo.add("Todo Terreno");
        ArrayAdapter<String> adaptador = new ArrayAdapter<>(Generar_Registro.this,
                android.R.layout.simple_spinner_item,tipo);
        spTipo.setAdapter(adaptador);
        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Generar_Registro.this,"Registrar",Toast.LENGTH_SHORT).show();
                String Marca = txtMarca.getText().toString();
                String Modelo = txtModelo.getText().toString();
                String Tipo = spTipo.getSelectedItem().toString();
                String Valoracion = Float.toString(ratingbar.getRating());
                String AC = Boolean.toString(checkBox.isChecked());
                if(AC.equals("true")){
                    AC = "Con aire Acondicionado";
                }else if(AC.equals("false")){
                    AC = "Sin Aire Acondicionado";
                }

                Auto auto = new Auto(Marca,Modelo,Tipo,Valoracion,AC);
                listaAuto.add(auto);
            }
        });

        txtMarca.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() < 2){
                    txtMarca.setError("Marca Muy Corta");
                    MarcaOk = false;
                }else {
                    MarcaOk = true;
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        txtModelo.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() < 2){
                    txtModelo.setError("Modelo Muy Corto");
                    ModeloOK = false;
                }else {
                    ModeloOK = true;
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }
}