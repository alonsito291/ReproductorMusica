package com.example.reproductormusica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class cuartaMusica extends AppCompatActivity {

    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuarta_musica);
    }
    public void Pause(View view) {
        mp.pause();
        Toast.makeText(this,"Pause",Toast.LENGTH_SHORT).show();
    }

    public void stop(View view) {
        mp.stop();
        mp=null;
        Toast.makeText(this,"Stop",Toast.LENGTH_SHORT).show();
    }

    public void play(View view) {
        mp= MediaPlayer.create(this,R.raw.cuartamusica);
        mp.start();
        Toast.makeText(this,"Play",Toast.LENGTH_SHORT).show();
    }

    public void anterior(View view) {
        Intent inanterior=new Intent(this,terceraMusica.class);
        mp.stop();
        startActivity(inanterior);
    }

    public void siguiente(View view) {
        Intent insiguiente= new Intent(this,quintaMusica.class);
        mp.stop();
        startActivity(insiguiente);
    }
}