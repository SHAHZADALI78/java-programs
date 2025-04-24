package com.Test.FileHandling.AppProject;
import java.io.*;
import java.util.*;

public class Comment {
    public int commentId;
    public String text;

    public Comment(int commentId, String text) {
        this.commentId = commentId;
        this.text = text;
    }

    public void saveToFile(int userId, int postId) {
        try (FileWriter fw = new FileWriter("comments_" + userId + "_" + postId + ".txt", true)) {
            fw.write(commentId + "," + text + "\n");
        } catch (IOException e) {
            System.out.println("Error saving comment.");
        }
    }

    public static List<Comment> loadComments(int userId, int postId) {
        List<Comment> comments = new ArrayList<>();
        File file = new File("comments_" + userId + "_" + postId + ".txt");
        if (!file.exists()) return comments;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",", 2);
                if (parts.length == 2) {
                    comments.add(new Comment(Integer.parseInt(parts[0]), parts[1]));
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading comments.");
        }
        return comments;
    }
}
