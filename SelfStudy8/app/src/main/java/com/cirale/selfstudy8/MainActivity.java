package com.cirale.selfstudy8;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    ImageView ivIrene;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivIrene = (ImageView) findViewById(R.id.iv_irene);

        findViewById(R.id.btn_start).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                startLoadingIreneImage();
            }
        });
    }

    private void startLoadingIreneImage() {
        String url = "https://nbamania.com/g2/data/file/freetalk/mania-done-1523900268_1EKV08lO_hdgallery.tistory.com023.jpg";

        Glide.with(this).load(url).into(ivIrene);

    }
}
