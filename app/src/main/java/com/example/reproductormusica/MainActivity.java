package com.example.reproductormusica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp;
   // WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //wv=(WebView)findViewById(R.id.webview);
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
        mp=MediaPlayer.create(this,R.raw.primeramusica);
        mp.start();
        Toast.makeText(this,"Play",Toast.LENGTH_SHORT).show();
    }

    public void anterior(View view) {
        Toast.makeText(this,"No hay musicas",Toast.LENGTH_SHORT).show();
    }

    public void siguiente(View view) {
        //mp.stop();
        Intent insiguiente= new Intent(this,segundaMusica.class);
        startActivity(insiguiente);
    }

   /* public void Informacion(View view) {
       wv.setWebViewClient(new WebViewClient());
       String URL="https://www.musica.com/letras.asp?letra=2048509";
       wv.loadUrl(URL);
    }*/
}