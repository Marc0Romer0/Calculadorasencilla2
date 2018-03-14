package com.romero.marco.calculadorasencilla;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txtnum1, txtnum2;
    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // buscando componentes
        txtnum1 = (EditText) findViewById(R.id.EDnumero1);
        txtnum2 = (EditText) findViewById(R.id.Ednumero2);
        resultado = (TextView) findViewById(R.id.txtResultado);

    }
    //metodo on click
    public void dosum(View v)
    {
        int num1 = Integer.parseInt(txtnum1.getText().toString());
        int num2 = Integer.parseInt(txtnum2.getText().toString());
        int resultado = num1 + num2;
        this.resultado.setText("" + resultado);
    }
    public void multiplicar(View v)
    {
        int num1 = Integer.parseInt(txtnum1.getText().toString());
        int num2 = Integer.parseInt(txtnum2.getText().toString());
        int resultado =  num1 * num2;
        this.resultado.setText(""+resultado);
    }
    public  void resta(View v)
    {
        int num1 = Integer.parseInt(txtnum1.getText().toString());
        int num2 = Integer.parseInt(txtnum2.getText().toString());
        int resultado =  num1 - num2;
        this.resultado.setText(""+resultado);
    }
    public void dividir(View v)
    {
        int num1 = Integer.parseInt(txtnum1.getText().toString());
        int num2 = Integer.parseInt(txtnum2.getText().toString());
        int resultado =  num1 / num2;
        this.resultado.setText(""+resultado);
    }
}


