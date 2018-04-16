package com.example.sweta.myapplication.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sweta.myapplication.R;

/**
 * Created by sweta on 4/16/18.
 */

public class ViewDetailFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_view_detail,container,false);

        return view;
    }
}
