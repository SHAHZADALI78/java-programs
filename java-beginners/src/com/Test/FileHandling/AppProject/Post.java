package com.Test.FileHandling.AppProject;

import java.io.*;
import java.util.*;

public class Post {
    public int postId;
    public String text;
    public int likes;

    public Post(int postId, String text) {
        this.postId = postId;
        this.text = text;
        this.likes = 0;
    }

    public void saveToFile(int userId) {
        try (FileWriter fw = new FileWriter("posts_" + userId + ".txt", true)) {
            fw.write(postId + "," + text + "," + likes + "\n");
        } catch (IOException e) {
            System.out.println("Error saving post.");
        }
    }

    public static List<Post> loadPosts(int userId) {
        List<Post> posts = new ArrayList<>();
        File file = new File("posts_" + userId + ".txt");
        if (!file.exists()) return posts;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",", 3);
                if (parts.length == 3) {
                    Post post = new Post(Integer.parseInt(parts[0]), parts[1]);
                    post.likes = Integer.parseInt(parts[2]);
                    posts.add(post);
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading posts.");
        }
        return posts;
    }

    public static void overwritePosts(List<Post> posts, int userId) {
        try (FileWriter fw = new FileWriter("posts_" + userId + ".txt", false)) {
            for (Post post : posts) {
                fw.write(post.postId + "," + post.text + "," + post.likes + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error updating posts.");
        }
    }
}
