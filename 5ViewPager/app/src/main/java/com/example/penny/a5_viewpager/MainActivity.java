package com.example.penny.a5_viewpager;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. ViewPager 객체 생성
        ViewPager viewPager = (ViewPager) findViewById(R.id.vp_pager);

        // 2. Fragment 객체 생성
        Fragment[] arrFragments = new Fragment[3];
        arrFragments[0] = new RedFragment();
        arrFragments[1] = new YelloFragment();
        arrFragments[2] = new GreenFragment();

        // 3. Adaptor 객체 생성
        //  Fragment 객체를 ViewPager 객체에 전달하는 역할
        MyPagerAdaptor adaptor = new MyPagerAdaptor(getSupportFragmentManager(), arrFragments);
        viewPager.setAdapter(adaptor);

        // 4. TabLayout을 생성하고 viewPager 에 연결
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tl_tabs);
        tabLayout.setupWithViewPager(viewPager);

    }

    // Fragment 객체를 Pager 에 전달하기 위한 Adaptor
    private class MyPagerAdaptor extends FragmentPagerAdapter {

        private Fragment[] arrFragments;

        public MyPagerAdaptor(FragmentManager fm, Fragment[] arrFragments) {
            super(fm);
            this.arrFragments = arrFragments;
        }

        @Override
        public Fragment getItem(int i) {
            return arrFragments[i];
        }

        @Override
        public int getCount() {
            return arrFragments.length;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {

            CharSequence title = "";
            switch (position)
            {
                case 0:
                    title = "Red";
                    break;
                case 1:
                    title = "Green";
                    break;
                case 2:
                    title = "Yellow";
                    break;
            }

            return title;
        }
    }
}
