package com.cirale.selfstudy5;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String FIRST_USER_KEY = "1000";
    // default = -1 -> first user
    // user = 1

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvHello = (TextView) findViewById(R.id.tv_hello);

        SharedPreferences sharedPreferences = getPreferences(Context.MODE_PRIVATE);
        int firstUser = sharedPreferences.getInt(FIRST_USER_KEY, -1);

        if (firstUser == 1){
            tvHello.setText(getString(R.string.hello_user));
        }
        else if (firstUser == -1){
            tvHello.setText(getString(R.string.hello_first));

            saveUserIsNotFirst();
        }
    }

    private void saveUserIsNotFirst() {
        SharedPreferences sharedPreferences = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(FIRST_USER_KEY, 1);
        editor.commit();
    }

}
