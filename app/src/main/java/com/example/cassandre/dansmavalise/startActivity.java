package com.example.cassandre.dansmavalise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.cassandre.dansmavalise.Database.FakeDatas;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        //Je simule un load des données.
        Thread welcomeThread = new Thread() {
            @Override
            public void run() {
                try {
                    super.run();
                    sleep(300);  //Delay of 10 seconds
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
