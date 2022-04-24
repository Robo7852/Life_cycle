package com.example.life_cycle;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class fragment1 extends Fragment {

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.d("Fragment1.java", "OnAttach() function called");
// add your code here which executes when fragment instance is associated
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Fragment1.java", "OnCreate function called");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment1, container, false);
        Log.d("Fragment1.java", "OnCreateView function called");
        return v;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d("Fragment1.java", "OnViewCreated() function called");


    }

    public void onStart(){
        super.onStart();
        Log.d("Fragment1.java", "OnStart() function called");

    }

    public void onResume(){

        super.onResume();
        Log.d("Fragment1.java", "OnResume() function called");
    }


    public void onPause(){
        super.onPause();
        Log.d("Fragment1.java", "OnPause() function called");

    }

    public void onStop(){
        super.onStop();
        Log.d("Fragment1.java", "OnStop() function called");


    }
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("Fragment1.java", "OnDestroyView() function called");

    }

    public void onDestroy(){
        super.onDestroy();
        Log.d("Fragment1.java", "OnDestroy() function called");

    }
    public void onDetach() {
        super.onDetach();
        Log.d("Fragment1.java", "OnDetach() function called");

    }
}