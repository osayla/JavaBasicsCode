package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		// let's ask a user where is he from
// based on the country we will define favorite food
		Scanner scan = new Scanner(System.in);
		String country , favoriteFood;
		System.out.println("Please tell me where are you from");
		 country = scan.nextLine();
		 switch(country) {
		 case "mexico":
	      favoriteFood= "tacos";
	      break;
		 case "canada":
		  favoriteFood= "poutine";
		  break;
		 case "turkey":
			 favoriteFood= "luhmacun" ;
		 break;
		 case "pakistan":
			 favoriteFood= "pati chai";
		 break;
		 case "egypt":
			 favoriteFood= "koshary";
		 break;
		 case "usa":
			 favoriteFood= "burger";
		break;
		default:
			favoriteFood= "unknown";
		 }
		 System.out.println("you are from "+country+" and your favorite food is  "+favoriteFood);
		
		
		
		
		
		
		
		
		
	}

}
