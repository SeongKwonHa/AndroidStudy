package com.cirale.selfstudy1;

import android.os.Bundle;
import android.app.Activity;
import android.widget.Toast;

public class CallActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

        String msg = getIntent().getStringExtra("message");

        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

}
