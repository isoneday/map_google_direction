package com.blackswan.mapgoogle.handlers;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.blackswan.mapgoogle.ListMApActivity;
import com.blackswan.mapgoogle.MapsActivity;
import com.blackswan.mapgoogle.PlacePickerActivity;
import com.blackswan.mapgoogle.databinding.ActivityMainBinding;
import com.blackswan.mapgoogle.helper.MyFunction;

/**
 * Created by iswandisaputra on 3/15/18.
 */

public class EventClick {
    Context c;

    public EventClick(Context c) {
        this.c = c;
    }

    public void onClickMap(View view) {
        c.startActivity(new Intent(c,MapsActivity.class));
    }
    public void onPlacepicker(View view) {
        c.startActivity(new Intent(c,PlacePickerActivity.class));
    }
    public void onListMap(View view) {
        c.startActivity(new Intent(c,ListMApActivity.class));
    }
}
