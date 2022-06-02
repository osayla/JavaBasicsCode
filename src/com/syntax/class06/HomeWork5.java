package com.syntax.class06;

import java.util.Scanner;

public class HomeWork5 {

	public static void main(String[] args) {
	    boolean a, b, c;
	     a = b = c = true;

	          if( !a || ( b && c ) ) {
	             System.out.println("If executed");
	          } else {
	             System.out.println("else executed");
	          }

	          Scanner scan = new Scanner(System.in);
	          System.out.println("Do you need a loan?");
	             boolean loan= scan. nextBoolean();
	              
	             int credit;
				if(loan){
	               System.out.println("What is your credit score");
	              credit= scan.nextInt();
	             }else if (credit<=600){
	               System.out.println("The eligibility is Not eligible");
	             }else if (credit>=600 || credit<700){
	               System.out.println("The eligibility is Maybe eligible");
	             }else if (credit>=701 || credit<800){
	               System.out.println("The eligibility is Eligible");
	             }else if(credit>800){
	               System.out.println("The eligibility is Definitely eligible");
	             }else {
	               System.out.println("Unknown");
	             }
	

	}

}
