package com.example.apptest.Util;

public class UtilGasEta {

    public static String calcOpcao(double gasolina, double etanol){

        double precoIdeal = gasolina * 0.7;
        String mensagemRetorno;

        if(etanol <= precoIdeal) {
            mensagemRetorno = "Abastecer com Etanol";
        } else {
            mensagemRetorno = "Abastecer com Gasolina";
        }

        return mensagemRetorno;

    }


}
