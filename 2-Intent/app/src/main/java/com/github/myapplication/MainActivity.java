package com.github.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // res/layout/activity_main.xml file 에 정의되어있는
        // widget/layout 정보와 mapping
        setContentView(R.layout.activity_main);

        //btn_call 과 onClick() 을 연결
        Button button = (Button) findViewById(R.id.btn_call);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        intent = new Intent(MainActivity.this, CallActivity.class);
        startActivity(intent);
        
    }
}
