package com.Test.Project.SocialMediaApp;

import java.util.ArrayList;
import java.util.Scanner;

public class SocialMediaApp {
    static ArrayList<User> users = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("<<<<<<<< Welcome to Social Media >>>>>>>>>");
            System.out.println("1- Create Account");
            System.out.println("2- Login");
            System.out.println("3- Exit");
            System.out.println("    Enter Your Choice     ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1 -> createAccount();
                case 2 -> login();
                case 3 ->{
                    System.out.println("Exiting program...");
                    return;
                }
            }
        }
    }

    static void createAccount() {
        System.out.print("Enter Username: ");
        String username = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        for (User user : users) {
            if (user.username.equals(username)) {
                System.out.println("Username already exists. Please try again.");
                return;
            }
        }

        int userId = users.size() + 1;
        users.add(new User(userId, username, password));
        System.out.println("Account created successfully.");
    }

    static void login() {
        System.out.print("Enter Username: ");
        String username = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        for (User user : users) {
            if (user.username.equals(username) && user.password.equals(password)) {
                System.out.println("Login successful!");
                userMenu(user);
                return;
            }
        }
        System.out.println("Bad credentials. Please try again.");
    }

    static void userMenu(User user) {
        while (true) {
            System.out.println(" Welcome Back To Menu Method: ");
            System.out.println("1- Update Account");
            System.out.println("2- Add New Post");
            System.out.println("3- Update Post");
            System.out.println("4- Delete Post");
            System.out.println("5- Comment on Post");
            System.out.println("6- Like a Post");
            System.out.println("7- Show All Feed");
            System.out.println("8- Logout");
            System.out.println(" Enter The Method You Want To Perform: ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1 -> updateAccount(user);
                case 2 -> addNewPost(user);
                case 3 -> updatePost(user);
                case 4 -> deletePost(user);
                case 5 -> commentOnPost(user);
                case 6 -> likePost(user);
                case 7 -> showAllFeed(user);
                case 8 -> {
                    System.out.println("Logged out to main menu.");
                    return;
                }
            }
        }
    }

    static void updateAccount(User user) {
        System.out.print("Enter new username: ");
        String newUsername = scanner.nextLine();
        System.out.print("Enter new password: ");
        String newPassword = scanner.nextLine();

        user.username = newUsername;
        user.password = newPassword;
        System.out.println("Account updated successfully.");
    }

    static void addNewPost(User user) {
        System.out.print("Enter Post ID: ");
        int postId = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Post Text: ");
        String postText = scanner.nextLine();

        user.posts.add(new Post(postId, postText));
        System.out.println("Post added successfully.");
    }

    static void updatePost(User user) {
        System.out.print("Enter Post ID to Update: ");
        int postId = Integer.parseInt(scanner.nextLine());
        for (Post post : user.posts) {
            if (post.postId == postId) {
                System.out.print("Enter New Text: ");
                post.text = scanner.nextLine();
                System.out.println("Post updated successfully.");
                return;
            }
        }
        System.out.println("Post not found.");
    }

    static void deletePost(User user) {
        System.out.print("Enter Post ID to Delete: ");
        int postId = Integer.parseInt(scanner.nextLine());
        user.posts.removeIf(post -> post.postId == postId);
        System.out.println("Post deleted successfully.");
    }

    static void commentOnPost(User user) {
        System.out.print("Enter Post ID: ");
        int postId = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Comment ID: ");
        int commentId = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Comment Text: ");
        String commentText = scanner.nextLine();

        for (Post post : user.posts) {
            if (post.postId == postId) {
                post.comments.add(new Comment(commentId, commentText));
                System.out.println("Comment added successfully.");
                return;
            }
        }
        System.out.println("Post not found.");
    }

    static void likePost(User user) {
        System.out.print("Enter Post ID to Like: ");
        int postId = Integer.parseInt(scanner.nextLine());

        for (Post post : user.posts) {
            if (post.postId == postId) {
                post.likes++;
                System.out.println("Post liked successfully.");
                return;
            }
        }
        System.out.println("Post not found.");
    }

    static void showAllFeed(User user) {
        for (Post post : user.posts) {
            System.out.println("Post ID: " + post.postId);
            System.out.println("Text: " + post.text);
            System.out.println("Likes: " + post.likes);
            System.out.println("Comments:");
            for (Comment comment : post.comments) {
                System.out.println("  - Comment ID: " + comment.commentId + ", Text: " + comment.text);
            }
        }
    }
}
