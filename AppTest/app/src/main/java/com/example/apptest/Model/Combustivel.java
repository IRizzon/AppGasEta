package com.example.apptest.Model;

public class Combustivel {

    private String nomeCombustivel;
    private double precoCombustivel;
    private String sugest;
    private int id;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCombustivel() {
        return nomeCombustivel;
    }

    public void setNomeCombustivel(String nomeCombustivel) {
        this.nomeCombustivel = nomeCombustivel;
    }

    public double getPrecoCombustivel() {
        return precoCombustivel;
    }

    public void setPrecoCombustivel(double precoCombustivel) {
        this.precoCombustivel = precoCombustivel;
    }

    public String getSugest() {
        return sugest;
    }

    public void setSugest(String resultado) {
        this.sugest = resultado;
    }
}
