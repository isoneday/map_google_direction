package com.blackswan.mapgoogle;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.blackswan.mapgoogle.databinding.ActivityMainBinding;
import com.blackswan.mapgoogle.handlers.EventClick;
import com.blackswan.mapgoogle.helper.MyFunction;

public class MainActivity extends MyFunction {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setClick(new EventClick(MainActivity.this));
    }


}
