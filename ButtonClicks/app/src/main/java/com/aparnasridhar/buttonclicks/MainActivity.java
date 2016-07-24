package com.aparnasridhar.buttonclicks;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button click;
    Button annon;
    Button inner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Handle using implements on MainActivity
        click = (Button)findViewById(R.id.button);
        click.setOnClickListener(this);
        final Context c = this;

        //Handle by Annonymous Class
        //Best for onSpot implementation, not ideal for code reuse
        annon = (Button)findViewById(R.id.buttonAnnon);
        annon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(c, "Click Handled by Annonymous Class", Toast.LENGTH_SHORT).show();
            }
        });

        //Handle by Separate Inner class to Handle Button Clicks
        //Best for not directly making Activity handle clicks
        inner = (Button)findViewById(R.id.buttonInner);
        inner.setOnClickListener(new ButtonHandler());

    }

    @Override
    public void onClick(View view) {

        int id = view.getId();
        switch(id){
            case R.id.button:
                Toast.makeText(this, "Click handled by Activity", Toast.LENGTH_SHORT).show();
        }
    }

    //Handle by Method defined in XML
    //Doesn't work for fragments
    public void doSomething(View view){
        int id = view.getId();
        switch(id){
            case R.id.buttonMethod:
                Toast.makeText(this, "Click handled by method in XML", Toast.LENGTH_SHORT).show();
        }
    }

    //Inner class to handle button clicks
    class ButtonHandler implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            int id = view.getId();
            switch(id){
                case R.id.buttonInner:
                    Toast.makeText(getApplicationContext(), "Click handled by inner class", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
