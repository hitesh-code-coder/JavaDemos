package com.sristi.array;

import java.util.Scanner;

public class ScanDemoTwo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name");
        String name = sc.nextLine();
        System.out.println("Name " + name);

        System.out.println("Enter Id");
        int id = sc.nextInt();
        System.out.println("Id " + id);

        sc.nextLine(); //flushing the line and come to a new line

        System.out.println("Enter Department");
        String dept = sc.nextLine();
        System.out.println("Dept " + dept);

        System.out.println("Enter salary");
        double salary = sc.nextDouble();
        System.out.println("Salary " + salary);

        //close the scanner
        sc.close();
    }
}