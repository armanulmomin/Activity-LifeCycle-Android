package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Toast toast=Toast.makeText(this,"SecondAcitivity onCreate",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }

    protected void onStart()
    {
        super.onStart();
        Toast toast=Toast.makeText(this,"SecondAcitivity onStart",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }

    protected void onResume()
    {
        super.onResume();
        Toast toast=Toast.makeText(this,"SecondAcitivity onResume",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }

    protected void onPause()
    {
        super.onPause();
        Toast toast=Toast.makeText(this,"SecondAcitivity onPause",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }

    protected void onStop()
    {
        super.onStop();
        Toast toast=Toast.makeText(this,"SecondAcitivity onStop",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }

    protected void onRestart()
    {
        super.onRestart();
        Toast toast=Toast.makeText(this,"SecondAcitivity onRestart",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }

    protected void onDestroy()
    {
        super.onDestroy();
        Toast toast=Toast.makeText(this,"SecondAcitivity onDestroy",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }



}