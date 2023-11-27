package com.example.apptest.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.apptest.Controller.CombustivelController;
import com.example.apptest.Model.Combustivel;
import com.example.apptest.R;
import com.example.apptest.Util.UtilGasEta;

import java.util.List;

public class MainActivity extends AppCompatActivity {


    List<Combustivel> data;


    CombustivelController control;

    Combustivel combustivelGasolina;
    Combustivel combustivelEtanol;

    EditText idGas;
    EditText idEta;

    TextView idResultado;

    Button idCalc;
    Button idClear;
    Button idSave;
    Button idEnd;

    String sugest;
    double precoGasolina;
    double precoEtanol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        control = new CombustivelController(MainActivity.this);
        data = control.getDataList();

        control.toString();

        idGas = findViewById(R.id.idGas);
        idEta = findViewById(R.id.idEta);

        idResultado = findViewById(R.id.idResultado);

        idCalc = findViewById(R.id.idCalc);
        idSave = findViewById(R.id.idSave);
        idClear = findViewById(R.id.idClear);
        idEnd = findViewById(R.id.idEnd);


        idCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean isDadosOK = true;

                if(TextUtils.isEmpty(idEta.getText())){
                    idEta.setError("Campo Obrigatório");
                    idEta.requestFocus();
                    isDadosOK = false;


                }
                if (TextUtils.isEmpty(idGas.getText())){
                    idGas.setError("Campo Obrigatório");
                    idGas.requestFocus();
                    isDadosOK = false;
                }
                if (isDadosOK){
                    precoGasolina = Double.parseDouble(idGas.getText().toString());
                    precoEtanol = Double.parseDouble(idEta.getText().toString());
                    sugest = UtilGasEta.calcOpcao(precoGasolina, precoEtanol);
                    idResultado.setText(sugest);

                    idSave.setEnabled(true);

                } else {
                    Toast.makeText( MainActivity.this, "Preencha os campos obrigatórios!", Toast.LENGTH_SHORT).show();

                    idSave.setEnabled(false);
                }

            }
        });

        idClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                idGas.setText("");
                idEta.setText("");

                idSave.setEnabled(false);
                idResultado.setText("Resultado");

                control.Limpar();



            }
        });

        idSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                combustivelEtanol = new Combustivel();
                combustivelGasolina = new Combustivel();

                combustivelGasolina.setNomeCombustivel("Gasolina");
                combustivelGasolina.setPrecoCombustivel(precoGasolina);

                combustivelEtanol.setNomeCombustivel("Etanol");
                combustivelEtanol.setPrecoCombustivel(precoEtanol);

                combustivelGasolina.setSugest(UtilGasEta.calcOpcao(precoGasolina, precoEtanol));
                combustivelEtanol.setSugest(UtilGasEta.calcOpcao(precoGasolina, precoEtanol));

                control.Salvar(combustivelGasolina);
                control.Salvar(combustivelEtanol);

            }
        });

        idEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

}






