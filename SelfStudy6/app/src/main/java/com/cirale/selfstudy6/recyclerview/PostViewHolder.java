package com.cirale.selfstudy6.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.cirale.selfstudy6.R;

/**
 * Created by sungkwonkim on 2018. 8. 9.
 */
public class PostViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public CheckBox cbLike;
    public ImageView ivImg, ivLike, ivShare;
    public TextView tvLikeCount, tvUserName, tvPostText;
    private PostAdapter mAdapter;

    public PostViewHolder(View itemView, PostAdapter postAdapter) {
        super(itemView);
        mAdapter = postAdapter;
        ivImg = (ImageView) itemView.findViewById(R.id.iv_img);
        cbLike = (CheckBox) itemView.findViewById(R.id.cb_like);
        ivShare = (ImageView) itemView.findViewById(R.id.iv_share);

        tvLikeCount = (TextView) itemView.findViewById(R.id.tv_like_count);
        tvUserName= (TextView) itemView.findViewById(R.id.tv_user_name);
        tvPostText = (TextView) itemView.findViewById(R.id.tv_post_text);

        cbLike.setOnClickListener(this);
        ivShare.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        int position = getAdapterPosition();

        switch (view.getId()){
            case R.id.cb_like:
                mAdapter.onLikeClicked(position);
                break;
            case R.id.iv_share:
                break;

        }

    }
}
