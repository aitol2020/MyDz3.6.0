package com.example.mydz36;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.mydz36.oneFragment.ExchangeFragment;
import com.example.mydz36.threeFragment.MoreFragment;
import com.example.mydz36.twoFragment.DateTiimeFragment;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {


    TabLayout tabLayout;
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabs);
        viewPager = findViewById(R.id.viewpager);

        setViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);
    }


    private void setViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new ExchangeFragment(), "Exchange");
        adapter.addFragment(new DateTiimeFragment(), "Date&Time");
        adapter.addFragment(new MoreFragment(), "More");
        ;


        viewPager.setAdapter(adapter);

    }
}