package com.example.android.projectfanta;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MyAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_account);
    }

    @Override
    public void onStart(){
        super.onStart();
    }

    public void saveClick(View v){
        // SAVE THE USER INFO
    }

    public void exitClick(View v){
        // EXIT THIS SCREEN
    }

}