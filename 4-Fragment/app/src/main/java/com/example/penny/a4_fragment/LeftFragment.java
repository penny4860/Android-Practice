package com.example.penny.a4_fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class LeftFragment extends Fragment implements View.OnClickListener {


    public LeftFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_left, null, false);
        view.findViewById(R.id.v_blue).setOnClickListener(this);
        view.findViewById(R.id.v_green).setOnClickListener(this);
        view.findViewById(R.id.v_red).setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

    }
}
