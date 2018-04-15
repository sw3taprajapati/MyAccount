package com.example.sweta.myapplication.myactivities;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.sweta.myapplication.R;
import com.example.sweta.myapplication.viewpager.MyViewPageAdapter;

public class MainActivity extends AppCompatActivity {

    ViewPager pagerView;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initActivity();
        setAdapter();
    }

    private void initActivity() {
        pagerView = findViewById(R.id.viewPager);
        tabLayout=findViewById(R.id.tabLayout);

    }
    private void setAdapter(){
        MyViewPageAdapter myViewPageAdapter=new MyViewPageAdapter(getSupportFragmentManager());
        pagerView.setAdapter(myViewPageAdapter);
        tabLayout.setupWithViewPager(pagerView);

    }

}
