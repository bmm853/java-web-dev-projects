package org.launchcode;

import java.util.Arrays;
public class ArrPract {
    public static void main(String[] args) {
        int[] intArray = {1, 1, 2, 3, 5, 8};

        for (int i : intArray) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        String str = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

//        String[] newString = str.split(" ");
        String[] newString = str.split("\\.");
        System.out.println(Arrays.toString(newString));
    }
}
