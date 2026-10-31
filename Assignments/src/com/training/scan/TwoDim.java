package com.training.scan;
import java.util.Scanner;

public class TwoDim {

    public static void main(String[] args) {

        int count = 0;

        Scanner scanner = new Scanner(System.in);

        String[][] array = new String[2][3];

        System.out.println("Enter 6 names:");

        // Populate 2D array
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                array[i][j] = scanner.nextLine();
            }
        }

        // Display 2D array
        System.out.println("Elements of the array:");

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                System.out.println(array[i][j]);
            }
        }

        // Count names starting with S
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                if (array[i][j].toLowerCase().startsWith("s")) {
                    count++;
                }
            }
        }

        // Create 1D array
        String[] result = new String[count];

        int index = 0;

        // Populate 1D array
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                if (array[i][j].toLowerCase().startsWith("s")) {

                    result[index] = array[i][j];
                    index++;
                }
            }
        }

        // Print 1D array
        System.out.println("Names starting with S:");

        for (String name : result) {
            System.out.println(name);
        }

        scanner.close();
    }
}