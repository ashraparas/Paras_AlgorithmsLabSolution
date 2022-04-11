package com.glearning.pg.main;
import java.util.Scanner;

import com.glearning.pg.services.TransactionService;

public class Driver {

	public static void main(String[] args) 
						{
		TransactionService ts= new TransactionService();
		System.out.println("Enter the Transaction size :");
						
		Scanner s = new Scanner(System.in);
		int transactionSize=0;
		transactionSize = s.nextInt();
			
		int[] transactionArray=new int[transactionSize];
		System.out.println("Enter the values of array");
		for(int i=0;i<transactionArray.length;i++) {
			transactionArray[i]=s.nextInt();
		}
		
		System.out.println("Enter the total number of target that needs to achieved");
		int nooftraget=s.nextInt();
		
		for (int i=0;i<nooftraget;i++) {
			System.out.println();
			System.out.println("Enter the value of target");
			int target= s.nextInt();
			
			int numberOfDays=ts.transactionCalculator(transactionArray, target);
			if(numberOfDays==-1) {
				System.out.println("Target is not possible");
			}
			else {
				System.out.println( "Target Achieved after "+numberOfDays +" transaction");
			}
			
		}

	}
	
	

}

