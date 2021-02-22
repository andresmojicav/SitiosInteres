package com.andoriyu.mismapas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
double latitud = -34.6075682;
double longitud = -58.4370894;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

     public void irBariloche(View v){
        Intent i = new Intent(this, MapsActivity.class);
        i.putExtra("Latitud",-41.125681894910535);
        i.putExtra("Longitud",-71.31039848019596);
        i.putExtra("Lugar","Bariloche");
        startActivity(i);
    }

    public void irCataratas(View v){
        Intent i = new Intent(this, MapsActivity.class);
        i.putExtra("Latitud",-25.691364302791673);
        i.putExtra("Longitud",-54.43631085214719);
        i.putExtra("Lugar","Cataratas de Iguazu");
        startActivity(i);
    }

    public void irPuertoMadryn(View v){
        Intent i = new Intent(this, MapsActivity.class);
        i.putExtra("Latitud",-42.75957135371367);
        i.putExtra("Longitud",-64.99510371911309);
        i.putExtra("Lugar","Puerto Madryn");
        startActivity(i);
    }

    public void irSalinasGrandes(View v){
        Intent i = new Intent(this, MapsActivity.class);
        i.putExtra("Latitud",-23.68614521005284);
        i.putExtra("Longitud",-66.00908358152623);
        i.putExtra("Lugar","Salinas Grandes ");
        startActivity(i);
    }

}