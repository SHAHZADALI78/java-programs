package com.Test.Project.SocialMediaApp;

import java.util.ArrayList;

public class User {
    int id;
    String username;
    String password;
    ArrayList<Post> posts = new ArrayList<>();

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
}

