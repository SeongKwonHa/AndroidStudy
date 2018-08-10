package com.cirale.selfstudy6.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.cirale.selfstudy6.R;
import com.cirale.selfstudy6.model.PostItem;

import java.util.ArrayList;

// http://puzzleleaf.tistory.com/171 : ViewHolder에 대한 내용 정리

/**
 * Created by sungkwonkim on 2018. 8. 9.
 */
public class PostAdapter extends RecyclerView.Adapter<PostViewHolder> {

    private Context mContext;
    private  ArrayList<PostItem> postItems;

    public PostAdapter(Context context, ArrayList<PostItem> listItem) {
        mContext = context;
        postItems = listItem;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View baseView = View.inflate(mContext, R.layout.post_item, null);
        PostViewHolder postViewHolder = new PostViewHolder(baseView, this);
        return postViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        PostItem item = postItems.get(position);
        holder.tvUserName.setText(item.getUserName());
        holder.tvPostText.setText(item.getPostText());
        holder.tvLikeCount.setText(String.valueOf(item.getPostLikeCount()));

    }

    @Override
    public int getItemCount() {
        return postItems.size();
    }

    public void onLikeClicked(int position) {
        PostItem item = postItems.get(position);
        Toast.makeText(mContext, position +"  : " + item.getPostText(), Toast.LENGTH_LONG).show();
    }
}
