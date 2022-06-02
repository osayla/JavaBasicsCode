package com.syntax.class06;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1, num2;
		String operator;
		System.out.println("Welcome to calculator, Please enter the first number ");
		num1= scan.nextInt();
		System.out.println("Please enter the second number");
		num2= scan.nextInt();
		System.out.println("Please choose operator +,-,*, or / ");
        operator= scan.next();
         if (operator.equals("+")) {
        	 System.out.println("Your solution is "+(num1+num2));
         }else if (operator.equals("-")) {
          System.out.println("Your solution is "+(num1-num2));
         }else if (operator.equals("*")) {
        	 System.out.println("Your solution is "+(num1*num2));
         }else if (operator.equals("/")) {
        	 System.out.println("Your solution is "+(num1/num2));
         } else  {
        	 System.out.println("invalid");}
         
         // switch
         int solution;
         switch (operator) {
         case ("+"):
        	 solution= (num1+num2);
         break;
         case ("-"):
        	 solution= (num1-num2);
         break;
         case ("*"):
        	 solution= (num1*num2);
         break;
         case ("/"):
        	 solution= (num1/num2);
         break;
         default:
        	 solution= 0;
        }System.out.println("Your solution is "+solution);
       
        
        
	}

}
