package com.voter.service;

import com.voter.exception.NotEligibleException;

public interface IElectionBooth 
{
	boolean checkEliginility(int age, String locality,int voterId) throws NotEligibleException;

}
