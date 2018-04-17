package com.example.sweta.myapplication.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sweta.myapplication.R;
import com.example.sweta.myapplication.adapter.IncomeAdapter;
import com.example.sweta.myapplication.pojoclasses.PojoIncome;

import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;
import io.realm.RealmResults;

/**
 * Created by sweta on 4/12/18.
 */

public class IncomeFragment extends Fragment implements View.OnClickListener {
    private TextView amountText;
    private TextView sourceText;
    private TextView dateText;
    private RecyclerView recyclerView;
    private TextView totalAmount;
    private Button updateButton;
    private Realm realm;
    private Integer amount;
    private String date;
    private String source;
    private PojoIncome myPojo;
    //adapter for recyclerview
    private IncomeAdapter incomeAdapter;
    //list for recyclerview
    private List<PojoIncome> pojoIncomeList;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_income, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initComponents();
        initRecyclerView();
        setListener();
        populateReyclerView();
    }

    private void initComponents() {
        amountText = getActivity().findViewById(R.id.txtAmount);
        sourceText = getActivity().findViewById(R.id.txtSource);
        dateText = getActivity().findViewById(R.id.txtDate);
        recyclerView = getActivity().findViewById(R.id.recyclerView);
        updateButton = getActivity().findViewById(R.id.btnSave);
        totalAmount = getActivity().findViewById(R.id.totalAmtTxt);
    }

    private void initRecyclerView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        pojoIncomeList = new ArrayList<>();
        incomeAdapter = new IncomeAdapter(pojoIncomeList);
        recyclerView.setAdapter(incomeAdapter);
    }

    private void setListener() {
        updateButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (view == updateButton) {
            String txtAmount = amountText.getText().toString().trim();
            if (txtAmount.isEmpty()) {
                Toast.makeText(getActivity(), "Please Enter the Amount in number",
                        Toast.LENGTH_SHORT)
                        .show();
            } else {
                try {
                    amount = Integer.parseInt(txtAmount);

                } catch (Exception e) {
                    Toast.makeText(getActivity(), "Please Enter the Amount",
                            Toast.LENGTH_SHORT).
                            show();
                }
                source = sourceText.getText().toString().trim();

                if (source.isEmpty()) {
                    Toast.makeText(getActivity(), "Please Enter the Source of amount",
                            Toast.LENGTH_SHORT)
                            .show();
                } else {
                    date = dateText.getText().toString().trim();

                    if (date.isEmpty()) {
                        Toast.makeText(getActivity(), "Please Enter the Date",
                                Toast.LENGTH_SHORT)
                                .show();
                    } else {
                        myPojo = new PojoIncome(amount, source, date);
                        insertToRealm();
                        populateReyclerView();
                        Toast.makeText(getActivity(), "Sucessful",
                                Toast.LENGTH_SHORT)
                                .show();
                    }
                }
            }
        }
    }

    private void insertToRealm() {
        realm = Realm.getDefaultInstance();
        realm.beginTransaction();
        realm.copyToRealmOrUpdate(myPojo);
        realm.commitTransaction();
        realm.close();
    }

    private void populateReyclerView() {
        realm = Realm.getDefaultInstance();
        //get all PojoIncome
        RealmResults<PojoIncome> pojoIncomeRealmResultsList = realm.where(PojoIncome.class).findAll();
        //add all pojoIncomeRealmResultsList to our recyclerview list
        pojoIncomeList.addAll(realm.copyFromRealm(pojoIncomeRealmResultsList));
        //notify dataset changed to recyclerview
        incomeAdapter.notifyDataSetChanged();
    }
}
