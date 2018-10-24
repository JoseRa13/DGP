package com.elevensteps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

public class MenuRutasActivity extends AppCompatActivity {
    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_rutas);

        Intent intent = getIntent();
        Bundle extras = ((Intent) intent).getExtras();

        list = (ListView) findViewById(R.id.listaRutas);

        if(extras != null) {
            String type = extras.getString("TipoFiltro");
            Toast.makeText(this, type, Toast.LENGTH_LONG).show();
            populateList(type);
        }else{
            Toast.makeText(this, "vacio", Toast.LENGTH_LONG).show();
        }



    }

    private void populateList(String type){

    }
}
