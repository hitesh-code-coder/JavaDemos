package com.userapp.client;

import java.util.Scanner;

import com.userapp.exceptions.NameExistException;
import com.userapp.exceptions.TooLongException;
import com.userapp.exceptions.TooShortException;
import com.userapp.service.IUserService;
import com.userapp.service.UserServiceImpl;

public class Register {

	public static void main(String[] args) 
	{
		Scanner scr = new Scanner(System.in);

        IUserService user = new UserServiceImpl();

        try {
            System.out.println("Enter username:");
            String username = scr.nextLine();

            user.checkUsername(username);

            System.out.println("Username is available!");

            System.out.println("Enter password:");
            String password = scr.nextLine();

            user.createPassword(password);

            System.out.println("Welcome " + username + ". You are registered!");

        } catch (NameExistException e) {
            System.out.println(e.getMessage());

        } catch (TooShortException e) {
            System.out.println(e.getMessage());

        } catch (TooLongException e) {
            System.out.println(e.getMessage());

        } finally {
            scr.close();
        }
    }

}
