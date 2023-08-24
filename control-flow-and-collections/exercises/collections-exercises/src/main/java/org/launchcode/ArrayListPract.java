package org.launchcode;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayListPract {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<String> wordArr = new ArrayList<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(10);

        wordArr.add("fuzzy");
        wordArr.add("seventeen");
        wordArr.add("jar");
        wordArr.add("squid");
        wordArr.add("world");

        System.out.println(getEvenSum(nums));

        System.out.println("Search for words with how many letters? ");
        int chars = input.nextInt();
        input.close();
        printWords(wordArr, chars);
    }

    public static int getEvenSum(ArrayList<Integer> numbers) {
        int sum = 0;

        for (int num: numbers) {
            if (num % 2 == 0) {
                sum +=num;
            }
        }

        return sum;
    }

    public static void printWords(ArrayList<String> words, int numChars) {
        for (String word : words) {
            if (word.length() == numChars) {
                System.out.println(word);
            }
        }
    }
}
