package com.github.a3_view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.iv_like).setOnClickListener(this);
    }

    public void onClick(View v)
    {
        Toast.makeText(this, "Click", Toast.LENGTH_SHORT).show();
    }
}
