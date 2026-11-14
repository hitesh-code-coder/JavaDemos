package com.bankingapp;

public class AbsDemo {

	public static void main(String[] args) 
	{
		Bank branchone = new Branch1();
		branchone.carLoan();
		branchone.eduLoan();
		branchone.eduLoan();
		branchone.adminDetails();
		
		Branch1 bank = (Branch1)branchone;
		bank.depositDetails();
		
		Bank branchtwo = new SubBranch2();
		branchtwo.vehicalLoan();
		branchtwo.eduLoan();
		branchtwo.carLoan();
		
		Bank2 banktwo = (Bank2)branchtwo;
		banktwo.loanTypes();
		
		SubBranch2 subbranch = (SubBranch2)banktwo;
		subbranch.investmentType();	
		
	}

}
