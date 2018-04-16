package com.example.sweta.myapplication.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.sweta.myapplication.R;

/**
 * Created by sweta on 4/12/18.
 */

public class IncomeFragment extends Fragment {

    private TextView amountText;
    private TextView sourceText;
    private TextView dateText;
    private RecyclerView recyclerView;
    private TextView totalAmount;
    private Button updateButton;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_income,container,false);

        return view;


    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initComponents();
    }

    private void initComponents(){

        amountText=getActivity().findViewById(R.id.txtAmount);
        sourceText=getActivity().findViewById(R.id.txtSource);
        dateText=getActivity().findViewById(R.id.txtDate);
        recyclerView=getActivity().findViewById(R.id.recyclerView);
        updateButton=getActivity().findViewById(R.id.btnSave);
        totalAmount=getActivity().findViewById(R.id.totalAmtTxt);
    }
}
