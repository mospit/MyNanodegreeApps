package com.example.marcusclark.mynanodegreeapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnSpotify, btnScores, btnLibrary, btnBuildApp,
            btnXYZ, btnMyApp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSpotify = (Button) findViewById(R.id.btn_spotify);
        btnScores = (Button) findViewById(R.id.btn_scores);
        btnLibrary = (Button) findViewById(R.id.btn_library);
        btnBuildApp = (Button) findViewById(R.id.btn_buildApp);
        btnXYZ = (Button) findViewById(R.id.btn_xyz);
        btnMyApp = (Button) findViewById(R.id.btn_myApp);

        btnSpotify.setOnClickListener(this);
        btnScores.setOnClickListener(this);
        btnLibrary.setOnClickListener(this);
        btnBuildApp.setOnClickListener(this);
        btnXYZ.setOnClickListener(this);
        btnMyApp.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btn_spotify:
                Toast.makeText(this,"This Button will launch my Spotify Streamer App!",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_scores:
                Toast.makeText(this,"This Button will launch my Scores App!",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_library:
                Toast.makeText(this,"This Button will launch my Library App!",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_buildApp:
                Toast.makeText(this,"This Button will launch my Build It Bigger App!",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_xyz:
                Toast.makeText(this,"This Button will launch my XYZ App!",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_myApp:
                Toast.makeText(this,"This Button will launch my Capstone App!",
                        Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
