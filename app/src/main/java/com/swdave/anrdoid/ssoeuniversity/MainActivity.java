package com.swdave.anrdoid.ssoeuniversity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.android.ssoeuniversity.R;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Set up the ViewPager with the sections adapter
        ViewPager mViewPager = findViewById(R.id.container);
        setupViewPager(mViewPager);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

    }

    private void setupViewPager(ViewPager viewPager) {
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new SSOEUFragment(), "About");
        adapter.addFragment(new Day1Fragment(), "Day 1");
        adapter.addFragment(new Day2Fragment(), "Day 2");
        adapter.addFragment(new ThingsToDoFragment(), "Things To DO");
        viewPager.setAdapter(adapter);
    }

}