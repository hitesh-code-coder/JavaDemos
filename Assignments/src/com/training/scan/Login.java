package com.training.scan;

import java.util.Scanner;

public class Login {


    public static void main (String args[])
    {
        Scanner scanner = new Scanner(System.in);
        String[] usernames = new String[5];
        usernames[0] = "hitesh";
        usernames[1] = "ram";
        usernames[2] = "sham";
        usernames[3] = "vinay";
        usernames[4] = "roar";

        System.out.println("Enter username to login");
        String username = scanner.nextLine();

        for(int i=0; i<usernames.length ;i++)
        {
            if(usernames[i].equals(username))
            {System.out.println("You are logged in successfully");
            break;
            }
            else 
            {System.out.println("Invalid username");
            break;
            }
        }
        scanner.close();
    }
    
}

