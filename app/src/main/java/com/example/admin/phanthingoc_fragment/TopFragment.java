package com.example.admin.phanthingoc_fragment;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by admin on 6/26/2017.
 */

public class TopFragment extends Fragment implements View.OnClickListener{
    private View view;
    private EditText topText;
    private EditText bottomText;
    private Button button;
    private MainActivity mainActivity;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_top, container, false);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
    }

    private void initView() {
        topText=view.findViewById(R.id.top);
        bottomText=view.findViewById(R.id.bottom);
        button=view.findViewById(R.id.btnApply);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        String top=topText.getText().toString();
        String bottom=bottomText.getText().toString();
        ((MainActivity) getActivity()).setTopText(top);
        ((MainActivity) getActivity()).setBottomText(bottom);
        ((MainActivity) getActivity()).fillDataBottom();
    }
}
