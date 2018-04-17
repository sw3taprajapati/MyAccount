package com.example.sweta.myapplication.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sweta.myapplication.R;
import com.example.sweta.myapplication.pojoclasses.PojoIncome;
import com.example.sweta.myapplication.viewpager.ViewHolderIncome;

import java.util.List;

/**
 * Created by sweta on 4/17/18.
 */

public class IncomeAdapter extends RecyclerView.Adapter<ViewHolderIncome> {

        List<PojoIncome> pojoIncomeList;

        public IncomeAdapter(List<PojoIncome> pojos){

            pojoIncomeList=pojos;
        }
        @Override
        public ViewHolderIncome onCreateViewHolder(ViewGroup parent, int viewType) {

            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.recycler_view_income, parent, false);
            return new ViewHolderIncome(view);
        }


        @Override
        public void onBindViewHolder(ViewHolderIncome holder, int position) {


            PojoIncome myPojo=pojoIncomeList.get(position);
            holder.amount.setText(myPojo.getIncomeAmount().toString());
            holder.source.setText(myPojo.getIncomeSource().toString());
            holder.txtDate.setText(myPojo.getIncomeDate().toString());
        }

        @Override
        public int getItemCount() {
            return pojoIncomeList.size();
        }

}

