package com.syntax.class06;

import java.util.Scanner;

public class Replit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		   System.out.println("Are you thirsty?");
		   boolean thirsty= scan.nextBoolean();
		   System.out.println("Are you sleepy ");
		   boolean sleepy= scan.nextBoolean();
		   String drink;
		   if(thirsty && !sleepy){
		     drink= ("water");
		   }else if (thirsty && sleepy){
		     drink= ("coffe");
		   }else if (!thirsty && sleepy){
		     drink= ("tea");
		   }else {
		     drink= ("nothing");
		   } System.out.println("Look like you need to drink "+drink);
	}

}
