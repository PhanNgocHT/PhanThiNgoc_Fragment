package com.example.admin.phanthingoc_fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by admin on 6/27/2017.
 */

public class BottomFragment extends Fragment {
    private View view;
    private TextView tvTop;
    private TextView tvBottom;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_bottom, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
    }

    public void fillData() {
        String top=((MainActivity) getActivity()).getTopText();
        String bottom=((MainActivity) getActivity()).getBottomText();
        tvTop.setText(top);
        tvBottom.setText(bottom);

    }

    private void initView() {
        tvTop=view.findViewById(R.id.textTop);
        tvBottom=view.findViewById(R.id.textBottom);
    }


}
