package com.sristi.array;

import java.util.Scanner;

public class Register {

	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
        String[] names = new String[4];
        
        System.out.println("Enter 4 names : ");
        
        for(int i = 0; i<names.length;i++)
        	names[i] =scanner.nextLine();
        
        System.out.println("The names you have entered are : ");
        for(String name:names)
        	System.out.println(name + " ");
        
        
        System.out.println("Enter the user name : ");
        String username = scanner.nextLine();

        
        boolean found = false;

        for (String name : names) {

            if (name.equals(username)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("User name already taken !!!");
        }
        else {
            System.out.println("Welcome " + username);
        }
        
        scanner.close();
	}
}
