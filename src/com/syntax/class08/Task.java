package com.syntax.class08;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// print nums from 1 to 50 except those that are divisple by tree
		for(int i=1; i<=50; i++) {
			if(i%3==0) {
				continue;
			}System.out.print(i+" ");
		} 
		System.out.println();
		// create a program that will keep asking user to apply for a credit card
		//as soon you get yes from a user program should stop asking
		Scanner scan= new Scanner(System.in);
		String credit;
		do {
			System.out.println("Do you want to apply for credit card");
			credit= scan.next();
		}while(!credit.equalsIgnoreCase("Yes"));

	}

}
