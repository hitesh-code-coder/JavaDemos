package com.voter.client;

import com.voter.exception.NotEligibleException;
import com.voter.service.ElectionBoothImpl;
import com.voter.service.IElectionBooth;

public class Voter {

	public static void main(String[] args) 
	{
		IElectionBooth electionBooth = new ElectionBoothImpl();
		try {
			boolean result = electionBooth.checkEliginility(19, "Whitefield", 1001);
			if(result)
			{
				System.out.println("You are elegilble to vote");
			}
		} catch (NotEligibleException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Good bye !!!");
	}

}
