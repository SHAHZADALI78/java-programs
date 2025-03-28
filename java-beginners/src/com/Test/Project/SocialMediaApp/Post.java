package com.Test.Project.SocialMediaApp;

import java.util.ArrayList;

public class Post {
    int postId;
    String text;
    int likes = 0;
    ArrayList<Comment> comments = new ArrayList<>();

    public Post(int postId, String text) {
        this.postId = postId;
        this.text = text;
    }
}

