package com.aparnasridhar.explicitintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void intentToActivity(View view){

        //Usual way to call another Activity
        Intent i = new Intent(this,ActivityB.class);
        startActivity(i);

        //Another way to invoke Activity - useful when two classes of same name are within different pacakges

        //        Intent i = new Intent();
        //        i.setClassName("com.aparnasridhar.explicitintent","com.aparnasridhar.explicitintent.ActivityB");
        //        startActivity(i);
    }
}
