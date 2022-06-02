package com.syntax.class05;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter numbers of worked years");
		int years= scan.nextInt();
		if (years>=5) {
			System.out.println("You are eligible for the bonus");
			System.out.println("Please enter your salary");
		double salary= scan.nextDouble();	
		if (salary>=50000) {
			System.out.println("Your bonus is 5000 ");
		}else {
			System.out.println("Your bonus is 3000");}
		}else {
			System.out.println("You are not eligible for bonus");
		}

	}

}
