package com.bestpractices.fortestjit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bestpractices.mylibrarytestt.ForTesttt;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ForTesttt.Companion.getSalammm();
    }
}