package com.example.admin.phanthingoc_fragment;

import android.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private TopFragment topFragment;
    private BottomFragment bottomFragment;
    private String topText;
    private String bottomText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFragment();
    }

    private void initFragment() {
        bottomFragment= (BottomFragment) getFragmentManager().findFragmentById(R.id.fragment_bottom);
        topFragment= (TopFragment) getFragmentManager().findFragmentById(R.id.fragment_top);
    }

    public void fillDataBottom() {
        bottomFragment.fillData();
    }

    public String getTopText() {
        return topText;
    }

    public void setTopText(String topText) {
        this.topText = topText;
    }

    public String getBottomText() {
        return bottomText;
    }

    public void setBottomText(String bottomText) {
        this.bottomText = bottomText;
    }
}
