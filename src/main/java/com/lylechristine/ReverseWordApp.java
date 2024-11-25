package com.lylechristine;

import java.util.Scanner;

public class ReverseWordApp {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a word
        System.out.print("Enter a word to reverse: ");
        String inputWord = scanner.nextLine();

        //Reverse the word using StringBuilder
        String reversedWord = new StringBuilder(inputWord).reverse().toString();

        // Print the reversed word
        System.out.println("The reversed word is: " + reversedWord);

        // Close the scanner
        scanner.close();
    }
}
