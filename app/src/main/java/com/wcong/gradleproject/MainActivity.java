package com.wcong.gradleproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ((TextView) findViewById(R.id.txt)).setText(String.format("versionCode:\b%s\nversionName:\b%s", BuildConfig.VERSION_CODE, BuildConfig.VERSION_NAME));
    }
}
