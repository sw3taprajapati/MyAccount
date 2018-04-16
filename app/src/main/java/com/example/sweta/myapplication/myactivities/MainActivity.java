package com.example.sweta.myapplication.myactivities;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toolbar;

import com.example.sweta.myapplication.R;
import com.example.sweta.myapplication.fragments.BankDetailFragment;
import com.example.sweta.myapplication.fragments.CreditFragment;
import com.example.sweta.myapplication.fragments.ExpensesFragment;
import com.example.sweta.myapplication.fragments.IncomeFragment;
import com.example.sweta.myapplication.viewpager.MyViewPageAdapter;

public class MainActivity extends AppCompatActivity {

    ViewPager pagerView;
    TabLayout tabLayout;
    android.support.v7.widget.Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initActivity();
        initToolbar();
        setAdapter();
    }

    private void initToolbar(){
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Sujindra Maharjan");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override

    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()==R.id.menuIncome){
            Intent intent=new Intent(MainActivity.this,IncomeFragment.class);
            startActivity(intent);
        }else if(item.getItemId()==R.id.menuCredit) {
            Intent intent = new Intent(MainActivity.this, CreditFragment.class);
            startActivity(intent);
        }else if(item.getItemId()==R.id.menuExpenses) {
            Intent intent = new Intent(MainActivity.this, ExpensesFragment.class);
            startActivity(intent);
        }else if(item.getItemId()==R.id.menuBankDetails) {
            Intent intent = new Intent(MainActivity.this, BankDetailFragment.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    private void initActivity() {
        pagerView = findViewById(R.id.viewPager);
        tabLayout=findViewById(R.id.tabLayout);
        toolbar=findViewById(R.id.toolbar);

    }
    private void setAdapter(){
        MyViewPageAdapter myViewPageAdapter=new MyViewPageAdapter(getSupportFragmentManager());
        pagerView.setAdapter(myViewPageAdapter);
        tabLayout.setupWithViewPager(pagerView);

    }

}
