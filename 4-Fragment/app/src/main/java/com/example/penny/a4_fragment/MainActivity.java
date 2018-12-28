package com.example.penny.a4_fragment;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements OnColorButtonListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // 0: red 1: green 2: blue
    @Override
    public void onColorClick(int color) {

        Fragment fragment;

        switch (color)
        {
            case 0:
                fragment = new RedFragment();
                break;
            case 1:
                fragment = new GreenFragment();
                break;
            case 2:
                fragment = new BlueFragment();
                break;
            default:
                fragment = new BlueFragment();
        }

        // 런타임에 액티비티에 프래그먼트 추가하는 과정
        // 1) getSupportFragmentManager()를 호출하여 FragmentManager를 가져옵니다.
        // 2) beginTransaction()을 호출하여 FragmentTransaction을 생성
        // 3) add()를 호출하여 특정 Resource에 프래그먼트를 추가합니다.
        //      resouce/fragment
        getSupportFragmentManager().beginTransaction().add(R.id.fl_fragment, fragment).commit();

    }
}
