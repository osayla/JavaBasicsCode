package com.syntax.class05;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter your city");
		String city = scan.next();
		System.out.println("Please inter the temprature");
		int tempF= scan.nextInt();
		
		int tempC= (tempF-32)*5/9;
		System.out.println("the temprature in your city "+city+" is "+tempC);
		
		
		
		
		
		
		
		
		
		

	}

}
