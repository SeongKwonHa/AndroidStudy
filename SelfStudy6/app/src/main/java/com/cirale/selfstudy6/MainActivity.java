package com.cirale.selfstudy6;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.cirale.selfstudy6.model.PostItem;
import com.cirale.selfstudy6.recyclerview.PostAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<PostItem> listItem = new ArrayList<>();

        RecyclerView rvList = findViewById(R.id.rv_list);

        for (int i = 0; i < 20; i++){
            PostItem item = new PostItem(true,125,"irene",
                    "https://www.google.co.kr/url?sa=i&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwjqpaPlxd_cAhWDa94KHdK0BUEQjRx6BAgBEAU&url=http%3A%2F%2Fwww.sedaily.com%2FNewsView%2F1OL1BI7GVZ&psig=AOvVaw1huma0U11yEB1xi8CZIP70&ust=1533889473357358", "wow!!");
            listItem.add(i, item);
        }

        PostAdapter adapter = new PostAdapter(this, listItem);
        rvList.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        rvList.setAdapter(adapter);


    }
}
