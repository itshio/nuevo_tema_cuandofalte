package com.example.nuevo_tema_cuandofalte;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //CREAMOS UNA VARIABLE FINAL PARA GUARDAR LA ETIQUETA
    static final String EXTRA_PERSONA = "PERSONA";

    EditText etnombre, etsueldo, etedad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etnombre=(EditText)findViewById(R.id.main_txt_nombre);
        etedad=(EditText)findViewById(R.id.main_txt_edad);
        etsueldo=(EditText)findViewById(R.id.main_txt_sueldo);

    }//oncreate

    public void mainclickaceptar (View view){

        String nombre = etnombre.getText().toString();
        String cajaedad = etedad.getText().toString();
        String cajasueldo = etsueldo.getText().toString();

        if(nombre.equals("")||cajaedad.equals("")||cajasueldo.equals("")){
            Toast.makeText(getApplicationContext(), "Debes rellenar los campos", Toast.LENGTH_SHORT).show();

        }else{

            int edad = Integer.parseInt(cajaedad);
            double sueldo = Double.parseDouble(cajasueldo);

            //Creamos el objeto tipo persona con los valores recogidos del formulario
            Persona persona = new Persona(nombre,edad,sueldo);
            //Creamos el objeto intent para enviar nuestra persona a otra activity

            Intent i=new Intent(getApplicationContext(),PersonaActivity.class);
            i.putExtra(EXTRA_PERSONA,persona);

            //Iniciamos el nuevo Activity

            startActivity(i);



        }
    }


}//Fin
