package com.syntax.class05;

import java.util.Scanner;

public class HomeWork5 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter your month of birth");
		String month= scan.next();
		 
		if (month.equals("march") || month.equals("april") || month.equals("may")) {
			System.out.println("You were born in season spring");
		}else if (month.equals("june") || month.equals("july") || month.equals("august")) {
			System.out.println("You were bonr in season summer");
		}else if (month.equals("september") || month.equals("october")) {
			System.out.println("You were bonr in season fall");
		}else if (month.equals("november") || month.equals("december") || month.equals("january") || month.equals("february")) {
			System.out.println("You were bonr in season winter");
		}
		

	}

}
