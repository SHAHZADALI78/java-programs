package com.Test.FileHandling.AppProject;
import java.io.*;
import java.util.*;


public class User {
    public int id;
    public String username;
    public String password;

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public void saveToFile() {
        try (FileWriter fw = new FileWriter("users.txt", true)) {
            fw.write(id + "," + username + "," + password + "\n");
        } catch (IOException e) {
            System.out.println("Error saving user.");
        }
    }

    public static List<User> loadAllUsers() {
        List<User> users = new ArrayList<>();
        File file = new File("users.txt");
        if (!file.exists()) return users;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    users.add(new User(Integer.parseInt(parts[0]), parts[1], parts[2]));
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading users.");
        }
        return users;
    }
}
