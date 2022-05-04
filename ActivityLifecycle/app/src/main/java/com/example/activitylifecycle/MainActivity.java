package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"onCreate",Toast.LENGTH_SHORT).show();
        textView=findViewById(R.id.FirstActivityid);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });


    }

    protected void onStart()
    {
        super.onStart();
        Toast.makeText(this,"FirstActivity onStart",Toast.LENGTH_SHORT).show();
    }

    protected void onResume()
    {
        super.onResume();
        Toast.makeText(this,"FirstActivity onResume",Toast.LENGTH_SHORT).show();
    }

    protected void onPause()
    {
        super.onPause();
        Toast.makeText(this,"FirstActivity onPause",Toast.LENGTH_SHORT).show();
    }

    protected void onStop()
    {
        super.onStop();
        Toast.makeText(this,"FirstActivity onStop",Toast.LENGTH_SHORT).show();
    }

    protected void onRestart()
    {
        super.onRestart();
        Toast.makeText(this,"FirstActivity onRestart",Toast.LENGTH_SHORT).show();
    }

    protected void onDestroy()
    {
        super.onDestroy();
        Toast.makeText(this,"FirstActivity onDestroy",Toast.LENGTH_SHORT).show();
    }


}


