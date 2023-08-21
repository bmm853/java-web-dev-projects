package org.launchcode;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) { //may need to change later
        String firstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        Scanner input = new Scanner(System.in);

        System.out.println("Which term would you like to find in this sentence?");
        String searchTerm = input.next();
        input.close();

        boolean result = firstSentence.toLowerCase().contains(searchTerm.toLowerCase());
        int index = firstSentence.toLowerCase().indexOf(searchTerm.toLowerCase());
        int length = searchTerm.length();

        if (result) {
            System.out.println("Your term was found at index " + index + " and is " + length + " characters long.");

        } else {
            System.out.println("Your term was not found.");
        }

        String newSentence = firstSentence.replace(searchTerm, "");
        System.out.println(newSentence);
    }
}
