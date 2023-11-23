package com.example.apptest.Model;

public class Combustivel {

    private String nomeCombustivel;
    private Double precoCombustivel;
    private String sugest;

    public String getNomeCombustivel() {
        return nomeCombustivel;
    }

    public void setNomeCombustivel(String nomeCombustivel) {
        this.nomeCombustivel = nomeCombustivel;
    }

    public double getPrecoCombustivel() {
        return precoCombustivel;
    }

    public void setPrecoCombustivel(Double precoCombustivel) {
        this.precoCombustivel = precoCombustivel;
    }

    public String getSugest() {
        return sugest;
    }

    public void setSugest(String resultado) {
        sugest = resultado;
    }
}
