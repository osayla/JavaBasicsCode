package com.syntax.class05;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//You are DMV representative and you need to ask customer their age.
	//	If they are 18 and older you will issue a driver license to them, 
	//	otherwise you will offer them to get a learners permit.
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your age");
	int age= scan.nextInt();
	
	if (age>=18) {
		System.out.println("I will issue a driver licence to you");
	}else {
		System.out.println("I prefer you get a learners permit ");
	}
	
	
	
	
	}

}
