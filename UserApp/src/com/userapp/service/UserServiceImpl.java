package com.userapp.service;

import com.userapp.exceptions.NameExistException;
import com.userapp.exceptions.TooLongException;
import com.userapp.exceptions.TooShortException;

public class UserServiceImpl implements IUserService {

	@Override
	public boolean checkUsername(String username) throws NameExistException {
	    String[] usernames = {"Sri", "Priya", "Joe", "Kathy"};

	    for (String name : usernames) {

	        if (name.equalsIgnoreCase(username)) {
	            throw new NameExistException("Name already exists");
	        }
	    }

	    return true;

	}

	@Override
	public boolean createPassword(String password) throws TooShortException, TooLongException {
		 if (password.length() < 6) {
		        throw new TooShortException();
		    }

		    if (password.length() > 15) {
		        throw new TooLongException();
		    }

		    return true;
	}

}
