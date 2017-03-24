package com.example.cassandre.dansmavalise;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

import com.example.cassandre.dansmavalise.Database.FakeDatas;

public class StartActivity extends Activity {

    private ProgressBar pb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        //On instancie les elements graphiques et on fait les retouches graphiques
        initGraphicElements();
        //On simule un chargement des données.
        load();
    }

    private void initGraphicElements(){
        pb = (ProgressBar) findViewById(R.id.startActivity_progressBar);

        //pb.getProgressDrawable().setColorFilter(
        //        Color.BLUE, android.graphics.PorterDuff.Mode.SRC_IN);
    }
    private void load(){
        Thread welcomeThread = new Thread() {
            @Override
            public void run() {
                try {
                    super.run();
                    sleep(1000);  //Delay of 10 seconds
                } catch (Exception e) {

                } finally {

                    FakeDatas.InitDatabase();
                    Intent i = new Intent(StartActivity.this,
                            MainActivity.class);
                    startActivity(i);
                    finish();
                }
            }
        };
        welcomeThread.start();
    }
}
