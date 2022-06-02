package com.syntax.class06;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
	
		String grade, explanation;
	   System.out.println("Please enter grade");
        grade= scan.next();
         switch (grade) {
         case ("A"):
        	 explanation= "Excellent";
         break;
         case ("B"):
        	 explanation= "Good";
         break;
         case ("C"):
        	 explanation= "Average";
         break;
         case ("D"):
        	 explanation= "Bad";
         break;
         default:
        	 explanation="Not Acceptable";
         
	}System.out.println("Your grade is "+grade+" and your explanation is "+explanation);
	}
}
