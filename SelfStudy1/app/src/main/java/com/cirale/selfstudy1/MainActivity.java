package com.cirale.selfstudy1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.btn_call);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
//        Toast.makeText(this, "Click!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, CallActivity.class);
        intent.putExtra("message", "Hi!!");
        startActivity(intent);
    }
}
