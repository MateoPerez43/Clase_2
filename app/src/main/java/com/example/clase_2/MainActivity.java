package com.example.clase_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText lado1, lado2, lado3;
    RadioButton triangulo, cuadrado;
    TextView resultado;
    Button calcular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //variables asocicadas con el activity_main.xml
        lado1 = findViewById(R.id.text1);
        lado2 = findViewById(R.id.text2);
        lado3 = findViewById(R.id.text3);
        triangulo = findViewById(R.id.triangulo);
        cuadrado = findViewById(R.id.cuadrado);
        resultado = findViewById(R.id.resultado);
        calcular = findViewById(R.id.calcular);


    }

    public void calcular(View view) {
        if (!lado1.getText().toString().isEmpty() && !lado2.getText().toString().isEmpty() && !lado3.getText().toString().isEmpty()) {

            float num1 = Float.parseFloat(lado1.getText().toString());
            float num2 = Float.parseFloat(lado2.getText().toString());
            float num3 = Float.parseFloat(lado3.getText().toString());

            if (triangulo.isChecked()) {
                String area = String.valueOf(num1 * num2 / 2);
                resultado.setText(area);
            } else {
                if (cuadrado.isChecked()) {
                    String area = String.valueOf(num1 * num2);
                    resultado.setText(area);
                }
            }
        }
    }

    public void limpiarTriangulo(View view) {
        triangulo.setChecked(false);
    }
    public void limpiarCuadrado(View view) {
        cuadrado.setChecked(false);
    }
}


