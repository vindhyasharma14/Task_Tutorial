package com.avvntechnology.task.Fragment;



import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.avvntechnology.task.R;


public class C_Android extends Fragment {


    FloatingActionButton q_post;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View view=inflater.inflate(R.layout.c_android_frag, container, false);



        return view;
    }


}
