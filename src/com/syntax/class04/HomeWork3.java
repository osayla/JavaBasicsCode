package com.syntax.class04;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println(" enter number1");
		int number1=scan.nextInt();
		
		System.out.println("Please enter number2 ");
		int number2=scan.nextInt();
		
		
		if (number1>number2) {
			System.out.println(number1+" Is larger than "+number2);
		}else {
			System.out.println(number2+" Is larger than "+number1);
		}

	}

}
