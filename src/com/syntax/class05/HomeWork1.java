package com.syntax.class05;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter the amount of loan you need");
		double loan = scan.nextDouble();
		if (loan<=200.000) {
			System.out.println("Your lend request is approved");
		}else {
			System.out.println("Your lend request is rejected");
		}
	

	}

}
