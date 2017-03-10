package com.example.ivan.myapplication;

import android.support.annotation.FloatRange;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    float result;
    TextView resultado;
    EditText valor1,valor2;
    Button suma,resta,multiplicacion,divicion;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado=(TextView)findViewById(R.id.tvResultado);
        suma= (Button) findViewById(R.id.btnSuma);
        resta=(Button) findViewById(R.id.btnResta);
        multiplicacion=(Button)findViewById(R.id.btnMultiplicacion);
        divicion=(Button)findViewById(R.id.btnDivicion);
        valor1=(EditText)findViewById(R.id.etValor1);
        valor2=(EditText)findViewById(R.id.etValor2);




    }
    public  void Suma(View view)
    {
        float numero2=Float.parseFloat(valor1.getText().toString());
        float numero1=Float.parseFloat(valor2.getText().toString());
        float resil=numero1+numero2;

        resultado.setText("Resultado = "+resil);
    }
    public void Resta(View view)
    {
        float numero2=Float.parseFloat(valor1.getText().toString());
        float numero1= Float.parseFloat(valor2.getText().toString());
        float resil=numero1-numero2;

        resultado.setText("Resultado = "+resil);
    }
    public void Multiplicacion (View view)
    {
        float numero2=Float.parseFloat(valor1.getText().toString());
        float numero1= Float.parseFloat(valor2.getText().toString());
        float resil=numero1*numero2;

        resultado.setText("Resultado = "+resil);
    }
    public void Divicion (View view)
    {
        float numero2=Float.parseFloat(valor1.getText().toString());
        float numero1= Float.parseFloat(valor2.getText().toString());
        float resil=numero1/numero2;

        resultado.setText("Resultado = "+resil);
    }
}
