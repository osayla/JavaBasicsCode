package com.syntax.class05;

import java.util.Scanner;

public class HomeWork6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter your scores for the quiz, midterm and final");
int quiz= scan.nextInt();
int midterm= scan.nextInt();
int finalexam= scan.nextInt();

if((quiz+midterm+finalexam)/3 >=90){
	System.out.println("Your grade is A");
}else if((quiz+midterm+finalexam)/3 <90 && (quiz+midterm+finalexam)/3 >70 ) {
	System.out.println("Your grade is B");
}else if((quiz+midterm+finalexam)/3 <70 && (quiz+midterm+finalexam)/3 >=50 ) {
	System.out.println("Your grade is C");
}else {
	System.out.println("Your grade is F");
}
	}

}
