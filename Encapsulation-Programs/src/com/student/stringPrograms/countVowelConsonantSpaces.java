package com.student.stringPrograms;

import java.util.Scanner;

public class countVowelConsonantSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        int countVowel = 0;
        int countConsonant = 0;
        int countSpaces = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            //System.out.println(" Count For Vowel Letters>>>>>>");
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                countVowel++;
            }
            //System.out.println(" <<<<<<<<Count For Consonant Letters>>>>>>>");
            else if (ch >= 'a' && ch <= 'z') {
                countConsonant++;
            }
             // System.out.println(" <<<<<<<<Count For Spaces>>>>>>>");
            else if (ch == ' ') {
                countSpaces++;

            }

        }
        System.out.println("Total Vowel Count: " + countVowel);
        System.out.println("Total Consonant Count: " + countConsonant);
        System.out.println("Total Spaces Count: " + countSpaces);
    }
}
