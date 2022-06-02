package com.syntax.class06;

public class SwitchStatement {

	public static void main(String[] args) {
		// if condition based statement
		 int day=6;
		String name;	
			if (day==1){
				name="Monday";}
		else if (day==2){
			name="Tuesday";}
		else if (day==3) {
			name="Wednesday";}
		else if (day==4) {
			name="Thursday";}
	   else if (day==5){
			name="Friday";}
		else if (day==6){
			name="Saturday";}
		else if (day==7){
			name="Sunday";}
		else {
			name="invalid";}
		System.out.println(name);
		
		switch (day) {// is a value based statment
		case 1:
			name = "monday";
			break;
		case 2:
			name = "tuesday";
			break;
		case 3:
			name = "wednsday";
			break;
		case 4:
			name = "thrusday";
			break;
		case 5:
			name = "friday";
			break;	
		case 6:
			name = "saturday";
			break;	
		case 7:
			name = "sunday";
			break;	
		default:
			name = "invalid";
			break;	
			}
		System.out.println(name);
		
		
		
		
		
		
		
		
		
		}
	}


