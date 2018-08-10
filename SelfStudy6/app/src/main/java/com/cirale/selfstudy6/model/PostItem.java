package com.cirale.selfstudy6.model;

/**
 * Created by sungkwonkim on 2018. 8. 9.
 */
public class PostItem {



    boolean isUserLike;
    String postImgUrl;
    String userName;
    int postLikeCount;
    String postText;

    public PostItem(boolean isUserLike, int postLikeCount,  String userName, String postImgUrl,  String postText) {
        this.isUserLike = isUserLike;
        this.postImgUrl = postImgUrl;
        this.userName = userName;
        this.postLikeCount = postLikeCount;
        this.postText = postText;
    }

    public boolean isUserLike() {
        return isUserLike;
    }

    public String getPostImgUrl() {
        return postImgUrl;
    }

    public String getUserName() {
        return userName;
    }

    public int getPostLikeCount() {
        return postLikeCount;
    }

    public String getPostText() {
        return postText;
    }
}
