package com.syntax.class06;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String country, language;
		System.out.println("Please enter the country you are from");
		country= scan.next();
		
		switch (country) {
			case ("Sudan"): 
		   language= "You speak arabic ";
			break;
			case ("France"):
		   language= "You speak french";
			break;
			case ("Germany"):
		   language= "You speak deutsch ";
			break;
			default:
				language="invalid";
		}System.out.println(language);		
		   
		
		

	}

}
