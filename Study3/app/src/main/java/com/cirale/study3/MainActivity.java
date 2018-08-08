package com.cirale.study3;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements  OnColorButtonListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GreenFragment greenFragment = new GreenFragment();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fl_right, greenFragment).commit();

    }

    // Color
    // 0: red, 1: green, 2: blue
    @Override
    public void onColorClick(int color) {
        Fragment fragment = null;

        switch (color){
            case 0:
                fragment = new RedFragment();
                break;
            case 1:
                fragment = new GreenFragment();
                break;
            case 2:
                fragment = new BlueFragment();
                break;
        }

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fl_right, fragment).commit();

    }
}
