package com.example.penny.a4_fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements OnColorButtonListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GreenFragment greenFragment = new GreenFragment();

        getSupportFragmentManager().beginTransaction().add(R.id.fl_fragment, greenFragment).commit();
    }

    // 0: red 1: green 2: blue
    @Override
    public void onColorClick(int color) {

    }
}
