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
        findViewById(R.id.iv_share).setOnClickListener(this);

    }

    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.iv_like:
                Toast.makeText(this, "Like Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.iv_share:
                Toast.makeText(this, "Share Clicked", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
