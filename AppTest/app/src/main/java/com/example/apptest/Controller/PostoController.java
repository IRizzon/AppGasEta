package com.example.apptest.Controller;

import com.example.apptest.Model.Posto;

import java.util.ArrayList;
import java.util.List;

public class PostoController {

    public List listaPosto;

    public List getListaPosto(){

        listaPosto = new ArrayList<Posto>();

        listaPosto.add(new Posto("Selecione um Posto"));
        listaPosto.add(new Posto("BR - Petrobrás"));
        listaPosto.add(new Posto("Shell"));
        listaPosto.add(new Posto("Ipiranga"));

        return listaPosto;

    }

    public ArrayList<String> dataSpinner(){

        ArrayList<String> data = new ArrayList<>();
        for (int i = 0; i < getListaPosto().size(); i++) {

            Posto objeto = (Posto) getListaPosto().get(i);

            data.add(objeto.getPostoDesejado());

        }

        return data;
    }
}
