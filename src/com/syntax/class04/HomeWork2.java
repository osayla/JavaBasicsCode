package com.syntax.class04;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		//1
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter your firstName");
		String firstName=input.next();
		System.out.println(firstName +" Enter your lastName");
		String lastName=input.next();
	    System.out.println(firstName +" "+lastName +" Enter state where you live");
		String state=input.next();
		System.out.println(firstName+" "+lastName+" lives in "+state);
		
		//2
		System.out.println(" enter number1");
		int number1=input.nextInt();
		
		System.out.println("Please enter number2 ");
		int number2=input.nextInt();
		
		
		if (number1>number2) {
			System.out.println(number1+" Is larger than "+number2);
		}else {
			System.out.println(number2+" Is larger than "+number1);
		}
		
		
		
		
		

	}

}
