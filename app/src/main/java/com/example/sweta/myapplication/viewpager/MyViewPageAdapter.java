package com.example.sweta.myapplication.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.sweta.myapplication.fragments.CreditFragment;
import com.example.sweta.myapplication.fragments.IncomeFragment;

/**
 * Created by sweta on 4/11/18.
 */

public class MyViewPageAdapter extends FragmentStatePagerAdapter {
    public MyViewPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        if(position==0){
            return new IncomeFragment();
        }else if(position==1){
            return new CreditFragment();
        }else {
            return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {

        if(position==0){
            return "Income";
        }else if(position==1){
            return  "Credits";
        }else{
            return null;
        }
    }

    @Override

    public int getCount() {
        return 2;
    }
}
