package com.rodrigo.evaluacion;

public class Auto {

    String Marca;
    String Modelo;
    String Tipo;
    String AC;
    String Valoracion;

    public Auto(String marca, String modelo, String tipo, String AC, String valoracion) {
        this.Marca = marca;
        this.Modelo = modelo;
        this.Tipo = tipo;
        this.AC = AC;
        this.Valoracion = valoracion;

    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getAC() {
        return AC;
    }

    public void setAC(String AC) {
        this.AC = AC;
    }

    public String getValoracion() {
        return Valoracion;
    }

    public void setValoracion(String valoracion) {
        Valoracion = valoracion;
    }

}
