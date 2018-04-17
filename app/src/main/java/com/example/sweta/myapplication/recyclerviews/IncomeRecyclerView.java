package com.example.sweta.myapplication.recyclerviews;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sweta.myapplication.R;
import com.example.sweta.myapplication.adapter.IncomeAdapter;
import com.example.sweta.myapplication.pojoclasses.PojoIncome;

import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;
import io.realm.RealmResults;

/**
 * Created by sweta on 4/17/18.
 */

public class IncomeRecyclerView  extends Fragment {

    private RecyclerView recycleView;
    private IncomeAdapter myAdapter;
    private List<PojoIncome> myPojoList;
    private RealmResults<PojoIncome> myPojoRealmResults;
    private Realm realm;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_income,container,false);

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews();
        initRecyclerView();
        setDataToAdapter();
    }
    private void initViews() {
        recycleView = getActivity().findViewById(R.id.recyclerView);
    }

    private void initRecyclerView() {
        recycleView.setLayoutManager(new LinearLayoutManager(
                getContext(), LinearLayoutManager.VERTICAL, false));

        myPojoList = new ArrayList<>();

        myAdapter = new IncomeAdapter(myPojoList);
        recycleView.setAdapter(myAdapter);

    }

    private void setDataToAdapter() {
        realm = Realm.getDefaultInstance();

        myPojoRealmResults = realm.where(PojoIncome.class).findAll();

        myPojoList.addAll(realm.copyFromRealm(myPojoRealmResults));

        realm.close();
        myAdapter.notifyDataSetChanged();
    }
}
