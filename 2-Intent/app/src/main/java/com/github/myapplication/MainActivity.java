package com.github.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // res/layout/activity_main.xml file 에 정의되어있는
        // widget/layout 정보와 mapping
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {

    }
}
