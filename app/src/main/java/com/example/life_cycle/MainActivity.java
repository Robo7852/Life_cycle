package com.example.life_cycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onStart(){
        super.onStart();
        Log.d("MainActivity.java", "OnStart() function called");

    }

    public void onResume(){

        super.onResume();
        Log.d("MainActivity.java", "OnResume() function called");
    }


    public void onPause(){
        super.onPause();
        Log.d("MainActivity.java", "OnPause() function called");

    }

    public void onStop(){
        super.onStop();
        Log.d("MainActivity.java", "OnStop() function called");


    }
    public void onDestroy(){
        super.onDestroy();
        Log.d("MainActivity.java", "OnDestroy() function called");

    }
}