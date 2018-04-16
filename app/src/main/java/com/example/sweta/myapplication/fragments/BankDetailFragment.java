package com.example.sweta.myapplication.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.sweta.myapplication.R;

/**
 * Created by sweta on 4/16/18.
 */

public class BankDetailFragment extends Fragment implements View.OnClickListener {

    private TextView accountNumber;
    private Button btnWithdrawal;
    private Button btnDeposit;
    private Button btnBankDetail;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_bankdetail,container,false);

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initViews();
        setListener();
    }

    private void initViews(){
        btnDeposit=getActivity().findViewById(R.id.btnDeposit);
        btnWithdrawal=getActivity().findViewById(R.id.btnWithdrawal);
        accountNumber=getActivity().findViewById(R.id.txtAccountNo);
        btnBankDetail=getActivity().findViewById(R.id.viewDetails);
    }

    private void setListener(){
        btnDeposit.setOnClickListener(this);
        btnWithdrawal.setOnClickListener(this);
        btnBankDetail.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view==btnDeposit){
            getActivity().getSupportFragmentManager().beginTransaction()
                    .replace(R.id.frameFragment, new DepositFragment())
                    .commit();
        } else if (view == btnWithdrawal) {
            getActivity().getSupportFragmentManager().beginTransaction()
                    .replace(R.id.frameFragment, new WithdrawlFragment())
                    .commit();
        }else if(view==btnBankDetail){
            getActivity().getSupportFragmentManager().beginTransaction()
                    .replace(R.id.frameFragment, new ViewDetailFragment())
                    .commit();
            btnBankDetail.setText("Recent details are given as above");
        }
    }
}
