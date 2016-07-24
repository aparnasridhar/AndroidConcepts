package com.aparnasridhar.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Activity Lifecyle","On Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Activity Lifecyle","On Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Activity Lifecyle","On Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Activity Lifecyle","On Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Activity Lifecyle","On Destroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Activity Lifecyle","On Re-Start");
    }
}
