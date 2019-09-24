package com.gebeya.fetan.framework;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.gebeya.fetan.R;
import com.gebeya.fetan.framework.base.BaseActivity;

public class WelcomeActivity extends BaseActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }
}
