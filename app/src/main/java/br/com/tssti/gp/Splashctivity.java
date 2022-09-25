package br.com.tssti.gp;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class Splashctivity extends AppCompatActivity {


    String TAG = "TELA SPLASH";
    int tempoDeEspera = 1000 * 5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashctivity);


        Log.d(TAG, "trocarDeTela: Tela Splash carregando... ");

        trocarDeTela();
    }


    private void trocarDeTela() {

            Log.d(TAG, "trocarDeTela: Mudando de tela... ");

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    Log.d(TAG, "trocaDeTela: esperando carregar a tela... ");

                    Intent trocarDetela = new Intent(Splashctivity.this, MainActivity.class);
                    startActivity(trocarDetela);
                    finish();

                }
            },tempoDeEspera);



    }
}