package com.example.myinstagram2.Model;

public class Notification {
    private String userId;
    private String text;
    private String postId;

    public Notification() {
    }

    public Notification(String userId, String text, String postId) {
        this.userId = userId;
        this.text = text;
        this.postId = postId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }
}
