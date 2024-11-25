package com.lylechristine;

import java.util.Scanner;

public class ReverseWordApp {
    public static void main(String[] args) {
        // Create a scanner object
        Scanner scanner = new Scanner(System.in);
        // Prompt user to enter a word
        System.out.println("Please enter a word: ");
        // Save  user's word in a variable
        String userWord = scanner.nextLine();
        // Reverse the word with a StringBuilder
        String reversedWord = new StringBuilder(userWord).reverse().toString();
        // Print the reversed word
        System.out.println("Your word reversed is " + reversedWord);

    }
}
