package com.syntax.class08;

import java.util.Scanner;

public class ForLoopWithS {

	public static void main(String[] args) {
		/* declare a secret number
		 * you want to ask user to guess your secret number
		 * you code should keep asking to guess until user gets your secret number
		 * once user gets the secret number--> you got it !
		 */
		Scanner scan= new Scanner(System.in);
        int a=0;
		
		
		while (a!=5) {
			System.out.println("What is my secret number?");
			 a=scan.nextInt();			
			
		} System.out.println("Well done");


	}

}
