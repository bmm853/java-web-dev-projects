package org.launchcode;

import java.util.Scanner;

public class Miles {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        double miles = input.nextDouble();
        System.out.println("How many gallons of gas did you use?");
        double gallons = input.nextDouble();
        input.close();

        double mpg = miles / gallons;

        System.out.println("You're getting " + mpg + " miles per gallon.");
    }
}
