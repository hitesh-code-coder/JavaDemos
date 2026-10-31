package com.training.scan;

import java.util.Scanner;

class Registration
{
    public static void main (String args[])
    {
        Scanner scanner = new Scanner(System.in);
        String[] usernames = new String[5];
        usernames[0] = "hitesh";
        usernames[1] = "ram";
        usernames[2] = "sham";
        usernames[3] = "vinay";
        usernames[4] = "roar";

        System.out.println("Enter name to register");
        String username = scanner.nextLine();

        for(int i=0; i<usernames.length ;i++)
        {
            if(usernames[i].equals(username))
            {System.out.println("Name is not unique");
            break;
            }
            else 
            {System.out.println("You are registered!");
            break;
            }
        }
        scanner.close();
    }
}