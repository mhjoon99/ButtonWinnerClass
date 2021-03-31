package com.example.buttonwinnerclass;

import android.view.View;

public class MyOnCickListener implements View.OnClickListener {
    MainActivity mainActivity;
    public MyOnCickListener(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View v) {
        mainActivity.mTextView1.setText("You clicked button 1");
    }
}
