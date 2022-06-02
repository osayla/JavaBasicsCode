package com.syntax.class05;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		// 1
Scanner scan= new Scanner(System.in);
System.out.println("Please enter your height");
int height= scan.nextInt();

if (height<60) {
	System.out.println("You are short");
}else if (height==60 && height==72) {
	System.out.println("You are medium");
}else if (height>72) {
	System.out.println("You are tall");
}
//2
int day = 4;
if (day==1 || day==2 || day==3 || day==4 || day==5) {
	System.out.println("It is a weekday");
}else if(day==6 || day==7) {
	System.out.println("It is a weekend");
}else {
	System.out.println("Invalid day");
}
//3
System.out.println("Enter a number");
int num = scan.nextInt();
if (num>=1 && num<=10) {
	System.out.println("Small number");
}else if(num>=11 && num<=100) {
	System.out.println("Medium number");
}else if (num>=101 && num<=1000) {
	System.out.println("Large number");
}

	
	
	
	
	
	
	
	}

}
