package com.example.qiaop.xiangmu_firstnavigation.fragment;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.qiaop.xiangmu_firstnavigation.R;

/**
 * A simple {@link Fragment} subclass.
 */
@SuppressLint("ValidFragment")
public class Reuse_Fragment extends Fragment {
    private String ChannelId;

    public Reuse_Fragment(String s) {
       ChannelId = s;
       Log.e("Reuse_Fragment", ChannelId);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_reuse_, container, false);
    }

}