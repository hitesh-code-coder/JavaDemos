
package com.basics.quest4;

import java.util.Scanner;

public class CourseMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Create Training object
        Training training = new Training();

        // Get trainer names from user
        System.out.println("Enter first trainer name:");
        String trainer1 = scanner.nextLine();

        System.out.println("Enter second trainer name:");
        String trainer2 = scanner.nextLine();

        // Call showTrainers using Scanner inputs
        System.out.println("\nTrainers entered by user:");
        training.showTrainers(trainer1, trainer2);

        // Call showTrainers using predefined names
        System.out.println("\nPredefined trainers:");
        training.showTrainers("Rohan", "Sathya");

        // Call showCourses() and receive the String array
        String[] courses = training.showCourses();

        // Iterate through the returned array
        System.out.println("\nAvailable courses:");

        for (String course : courses) {
            System.out.println(course);
        }

        scanner.close();
    }
}
