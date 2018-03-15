package com.blackswan.mapgoogle.handlers;

import android.view.View;

import com.blackswan.mapgoogle.MapsActivity;
import com.blackswan.mapgoogle.databinding.ActivityMainBinding;
import com.blackswan.mapgoogle.helper.MyFunction;

/**
 * Created by iswandisaputra on 3/15/18.
 */

public class EventClick {
    MyFunction myFunction = new MyFunction();
    ActivityMainBinding binding;
    public void onClickMap(View view) {
        binding = ActivityMainBinding.bind(view);

        myFunction.aksesclass(MapsActivity.class);
    }
}
