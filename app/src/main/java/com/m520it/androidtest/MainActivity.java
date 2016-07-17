package com.m520it.androidtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.todddavies.components.progressbar.ProgressWheel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ProgressWheel wheel = (ProgressWheel) findViewById(R.id.progressBarTwo);
        findViewById(R.id.btn_start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wheel.startSpinning();
            }
        });
        findViewById(R.id.btn_stop).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wheel.stopSpinning();
            }
        });


/*        ProgressWheel pw = new ProgressWheel(myContext, myAttributes);
        ProgressWheel pw = (ProgressWheel) findViewById(R.id.pw_spinner);
        pw.spin();*/
    }
}
