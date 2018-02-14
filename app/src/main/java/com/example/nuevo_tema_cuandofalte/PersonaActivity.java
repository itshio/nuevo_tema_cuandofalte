package com.example.nuevo_tema_cuandofalte;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PersonaActivity extends AppCompatActivity {

    TextView tvnombre,tvedad,tvsueldo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persona);

        tvnombre=(TextView)findViewById(R.id.PertvNombre);
        tvedad=(TextView)findViewById(R.id.PerTvEdad);
        tvsueldo=(TextView)findViewById(R.id.PerTvSueldo);

        Bundle b= getIntent().getExtras();
        if(b!=null){

            Persona p = b.getParcelable(MainActivity.EXTRA_PERSONA);
            tvnombre.setText(p.getNombre());
            tvedad.setText(p.getEdad()+"");
            tvsueldo.setText(p.getSueldo()+"");
        }




    }
}
