package com.Test.Project.BasicInfo;
import java.util.*;

public class BasicInfoApp {
    static ArrayList<BasicInfo> basicInfoList = new ArrayList<>();


    public static void createBasicInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your gender: ");
        String gender = sc.nextLine();
        System.out.print("Enter your address: ");
        String address = sc.nextLine();
        System.out.print("Enter your phone number: ");
        String phoneNumber = sc.nextLine();
        System.out.print("Enter your email: ");
        String email = sc.nextLine();

        BasicInfo newInfo = new BasicInfo(name, age, gender, address, phoneNumber, email);
        basicInfoList.add(newInfo);
        System.out.println("Basic information created successfully.");
    }

    public static void updateBasicInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of the basic info to update (0 to " + (basicInfoList.size() - 1) + "): ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index >= 0 && index < basicInfoList.size()) {
            BasicInfo info = basicInfoList.get(index);
            System.out.println("Current Info: ");
            info.displayInfo();

            System.out.println("Enter new details (Leave blank to keep current value): ");
            System.out.print("Enter new name: ");
            String name = scanner.nextLine();
            System.out.print("Enter new age: ");
            String ageInput = scanner.nextLine();
            int age = (ageInput.isEmpty()) ? info.age : Integer.parseInt(ageInput);
            System.out.print("Enter new gender: ");
            String gender = scanner.nextLine();
            System.out.print("Enter new address: ");
            String address = scanner.nextLine();
            System.out.print("Enter new phone number: ");
            String phoneNumber = scanner.nextLine();
            System.out.print("Enter new email: ");
            String email = scanner.nextLine();

            info.updateInfo(
                    name.isEmpty() ? null : name,
                    age,
                    gender.isEmpty() ? null : gender,
                    address.isEmpty() ? null : address,
                    phoneNumber.isEmpty() ? null : phoneNumber,
                    email.isEmpty() ? null : email
            );
            System.out.println("Information updated successfully.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    public static void displayBasicInfo() {
        if (basicInfoList.isEmpty()) {
            System.out.println("No information available.");
        } else {
            for (int i = 0; i < basicInfoList.size(); i++) {
                System.out.println("Info " + (i + 1) + ": ");
                basicInfoList.get(i).displayInfo();
            }
        }
    }

    public static void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("<<<<<<<<<<Welcome To BasicInfoApp>>>>>>>>>>");

            System.out.println("1. Create new basic info");
            System.out.println("2. Update basic info");
            System.out.println("3. Display all basic info");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    createBasicInfo();
                    break;
                case 2:
                    updateBasicInfo();
                    break;
                case 3:
                    displayBasicInfo();
                    break;
                case 4:
                    System.out.println("Exiting the app. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }
}
