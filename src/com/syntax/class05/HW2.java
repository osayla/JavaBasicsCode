package com.syntax.class05;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2. Create a Java program that will ask if user has a credit card or not.
		//If you user does not have a credit card then offer them.
		//If they do have one ask what is balance on the card? If balance of the card is larger than 1000, 
			//	tell them to pay off immediately,
			//	otherwise you can tell them that they can spend more.		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Do you have a credit card");
		String credit=scan.next();
		 if (credit.equals("no")) {//if i want to ignore the cs=asing i can put eqialsIgroreCase
			 System.out.println("We will offer you a credit card");}
		 else if(credit.equals("yes")) {
			 System.out.println("What is your balance");
		int balance=scan.nextInt();
	
		if (balance>1000) {
			System.out.println("You have to pay off immediately");
		}else {
			System.out.println("You can spend more");
		}
			
			
		 }	
		
		
	}

}
