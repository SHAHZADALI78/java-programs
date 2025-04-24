package com.Test.FileHandling.AppProject;
import java.util.*;

public class SocialMediaApp {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("<<<<<<<< Welcome to Social Media >>>>>>>>>");
            System.out.println("1- Create Account");
            System.out.println("2- Login");
            System.out.println("3- Exit");
            System.out.print("Enter Your Choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1 -> createAccount();
                case 2 -> login();
                case 3 -> {
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

        List<User> users = User.loadAllUsers();
        for (User user : users) {
            if (user.username.equals(username)) {
                System.out.println("Username already exists. Please try again.");
                return;
            }
        }

        int userId = users.size() + 1;
        User newUser = new User(userId, username, password);
        newUser.saveToFile();
        System.out.println("Account created successfully.");
    }

    static void login() {
        System.out.print("Enter Username: ");
        String username = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        List<User> users = User.loadAllUsers();
        for (User user : users) {
            if (user.username.equals(username) && user.password.equals(password)) {
                System.out.println("Login successful!");
                userMenu(user);
                return;
            }
        }
        System.out.println("UserName Or Password Is InCorrect");
    }

    static void userMenu(User user) {
        List<Post> posts = Post.loadPosts(user.id);

        while (true) {
            System.out.println("\n-- User Menu --");
            System.out.println("1- Add New Post");
            System.out.println("2- Update Post");
            System.out.println("3- Delete Post");
            System.out.println("4- Comment on Post");
            System.out.println("5- Like a Post");
            System.out.println("6- Show All Updated Data");
            System.out.println("7- Logout");
            System.out.print("Enter choice: ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Post ID:    ");
                    int postId = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter Post Text:   ");
                    String postText = scanner.nextLine();
                    Post post = new Post(postId, postText);
                    post.saveToFile(user.id);
                    posts.add(post);
                    System.out.println("Post added.");
                }
                case 2 -> {
                    System.out.print("Enter Post ID to update: ");
                    int postId = Integer.parseInt(scanner.nextLine());
                    for (Post post : posts) {
                        if (post.postId == postId) {
                            System.out.print("Enter new text: ");
                            post.text = scanner.nextLine();
                            Post.overwritePosts(posts, user.id);
                            System.out.println("Post updated.");
                            break;
                        }
                    }
                }
                case 3 -> {
                    System.out.print("Enter Post ID to delete: ");
                    int postId = Integer.parseInt(scanner.nextLine());
                    posts.removeIf(p -> p.postId == postId);
                    Post.overwritePosts(posts, user.id);
                    System.out.println("Post deleted.");
                }
                case 4 -> {
                    System.out.print("Enter Post ID to comment on: ");
                    int postId = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter Comment ID: ");
                    int commentId = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter Comment Text: ");
                    String commentText = scanner.nextLine();
                    Comment comment = new Comment(commentId, commentText);
                    comment.saveToFile(user.id, postId);
                    System.out.println("Comment added.");
                }
                case 5 -> {
                    System.out.print("Enter Post ID to like: ");
                    int postId = Integer.parseInt(scanner.nextLine());
                    for (Post post : posts) {
                        if (post.postId == postId) {
                            post.likes++;
                            Post.overwritePosts(posts, user.id);
                            System.out.println("Post liked.");
                            break;
                        }
                    }
                }
                case 6 -> {
                    System.out.println("All posts:");
                    for (Post post : posts) {
                        System.out.println("Post ID: " + post.postId);
                        System.out.println("Text: " + post.text);
                        System.out.println("Likes: " + post.likes);
                        List<Comment> comments = Comment.loadComments(user.id, post.postId);
                        for (Comment c : comments) {
                            System.out.println("  Comment ID: " + c.commentId + ", Text: " + c.text);
                        }
                    }
                }
                case 7 -> {
                    System.out.println("Logging out...");
                    return;
                }
            }
        }
    }
}
