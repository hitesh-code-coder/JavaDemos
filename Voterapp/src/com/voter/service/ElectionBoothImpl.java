package com.voter.service;

import com.voter.exception.InvalidVoterIdException;
import com.voter.exception.LocalityNotfoundException;
import com.voter.exception.NotEligibleException;
import com.voter.exception.UnderAgeException;

public class ElectionBoothImpl implements IElectionBooth {

	@Override
	public boolean checkEliginility(int age, String locality, int voterId) throws  NotEligibleException{
		if(checkAge(age) && checkLocality(locality)&&checkVoterId(voterId))
		return true;
		
		else return false;
	}
	
	private boolean checkAge(int age) throws UnderAgeException
	{
		if(age < 18)
			throw new UnderAgeException("Your age is under 18, not valid to vote");
		else
		return true;
		
	}
	
	
	private boolean checkLocality (String locality) throws LocalityNotfoundException
	{
		String[] localities = {"Whitefield", "Hoodi", "Aecs Layout"};

	    boolean flag = false;

	    for (String loc : localities) {

	        if (loc.equalsIgnoreCase(locality)) {
	            flag = true;
	            break;
	        }
	    }

	    if (flag) {
	        return true;
	    } else {
	        throw new LocalityNotfoundException("Your locality is not under this ward");
	    }
		
	}
	
	private boolean checkVoterId(int voterId) throws InvalidVoterIdException
	{

		 if (voterId >= 1000 && voterId <= 10000) {
		        return true;
		    } else {
		        throw new InvalidVoterIdException("voter ID is invalid");
		    }
		
	}
}
