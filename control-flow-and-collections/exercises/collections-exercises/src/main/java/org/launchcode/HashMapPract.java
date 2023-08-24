package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPract {
    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        //Get student name and ID
        do {

            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("Student ID: ");
                Integer newID = input.nextInt();
                students.put(newStudent, newID);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!newStudent.equals(""));

        System.out.println("\nClass roster:");

        for (Map.Entry<String, Integer> student : students.entrySet()) {
            System.out.println(student.getKey() + " (ID: " + student.getValue() + ")");
        }

        System.out.println("Number of students in roster: " + students.size());
    }
}
