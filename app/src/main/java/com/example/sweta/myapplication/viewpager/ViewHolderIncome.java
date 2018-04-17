package com.example.sweta.myapplication.viewpager;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.sweta.myapplication.R;

/**
 * Created by sweta on 4/17/18.
 */

public class ViewHolderIncome extends RecyclerView.ViewHolder {

    public EditText amount,source,txtDate;

    public ViewHolderIncome(View itemView) {
        super(itemView);

        initViews();
    }

    private void initViews(){

        amount=itemView.findViewById(R.id.txtAmount);
        source=itemView.findViewById(R.id.txtSource);
        txtDate=itemView.findViewById(R.id.txtDate);
    }
}
