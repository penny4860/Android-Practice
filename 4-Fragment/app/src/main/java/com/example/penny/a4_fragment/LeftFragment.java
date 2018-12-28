package com.example.penny.a4_fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class LeftFragment extends Fragment implements View.OnClickListener {

    // 1. event listener interface 를 private 변수로 정의
    private OnColorButtonListener onColorButtonListener;

    public LeftFragment() {
        // Required empty public constructor
    }

    // 2. onColorButtonListener(private 변수) 의 타입을 정의 : MainActivity class를 type casting
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        onColorButtonListener = (OnColorButtonListener) context;
    }

    // 3. Fragment가 가지고 있는 View 객체의 id 별로 onclick listener 함수를 mapping
    // view.findViewById(R.id.v_blue).setOnClickListener(this);
    // v_blue를 LeftFragment.onClick() 에 mapping
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

    // 4. View 객체를 클릭했을 때 실행되는 listener
    // MainActivity class method가 실행
    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.v_red:
                // onColorButtonListener : MainActivity class (2번과정)
                onColorButtonListener.onColorClick(0);
                break;
            case R.id.v_green:
                onColorButtonListener.onColorClick(1);
                break;
            case R.id.v_blue:
                onColorButtonListener.onColorClick(2);
                break;

        }

    }
}
