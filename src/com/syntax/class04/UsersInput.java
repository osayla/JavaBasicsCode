package com.syntax.class04;

import java.util.Scanner;

public class UsersInput {

	public static void main(String[] args) {
		//creating scanner
		Scanner input=new Scanner(System.in);
		
		//send instruction to the console
		System.out.println("Please enter your name ");
		
		//we need to grab the value from the console
		String name=input.next();
		
		System.out.println(name);
		
		//lets send instruction
		System.out.println(name+" Please enter your age");
		
		//need to capture and store age
		int age=input.nextInt();
		
		
		System.out.println(name+" is "+age+" years old");

		
		
		
		
		
		
	}

}
