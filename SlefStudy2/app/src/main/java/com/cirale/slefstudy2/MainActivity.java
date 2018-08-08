package com.cirale.slefstudy2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.iv_like).setOnClickListener(this);
        findViewById(R.id.iv_share).setOnClickListener(this);
        findViewById(R.id.iv_photo).setOnClickListener(this);
        findViewById(R.id.iv_photo).setOnTouchListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.iv_like:
                Toast.makeText(MainActivity.this, "I love it!!!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.iv_share:
                Toast.makeText(MainActivity.this, "I share it!!!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.iv_photo:
                Toast.makeText(MainActivity.this, "I click it!!!", Toast.LENGTH_SHORT).show();
                break;

        }
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {

        Log.d("custom", "pass touch");
        switch (motionEvent.getAction()){

            case MotionEvent.ACTION_DOWN:
                Toast.makeText(MainActivity.this, "TOUCH DOWN !!!", Toast.LENGTH_SHORT).show();
                break;
            case MotionEvent.ACTION_UP:
                Toast.makeText(MainActivity.this, "TOUCH UP !!!", Toast.LENGTH_SHORT).show();
                break;
        }
        return false;
    }
}
