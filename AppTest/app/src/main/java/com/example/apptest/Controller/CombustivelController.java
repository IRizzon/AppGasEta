package com.example.apptest.Controller;

import android.content.SharedPreferences;
import android.util.Log;

import androidx.annotation.NonNull;

import com.example.apptest.Model.Combustivel;
import com.example.apptest.View.MainActivity;

public class CombustivelController {

    SharedPreferences preferences;
    public static final String New_preferences = "pref_fuel";
    SharedPreferences.Editor fuelList;

    public CombustivelController(MainActivity mainActivity) {

        preferences = mainActivity.getSharedPreferences(New_preferences, 0);
        fuelList = preferences.edit();
    }


    @NonNull
    @Override
    public String toString() {

        Log.d("MVC_Controller", "Controller_Iniciado");
        return super.toString();


    }

    public void Limpar() {

        fuelList.clear();
        fuelList.apply();

    }

    public void Salvar(Combustivel combustivel) {

        fuelList.putString("Combustível: ", combustivel.getNomeCombustivel());
        fuelList.putFloat("Preço: ", (float) combustivel.getPrecoCombustivel());
        fuelList.putString("recomendacap: ", combustivel.getSugest());
        fuelList.apply();

    }
}
