package com.syntax.class04;

public class IfElseIf {

	public static void main(String[] args) {
		// i go to this method whenever i have more than one condition
		
		/*
		 *  declare 2 number and verify which one is the largest 
		 */
   int num1=20;
   int num2=67;
   
   if(num1>num2) {
	   System.out.println(num1+" is larger than "+num2);
   } else {
	   System.out.println(num2+" is the larger than "+num1);
   }
	 
   //if else if
   int num3=20;
   int num4=20;
   
   if(num3>num4) {
	   System.out.println(num3+" is larger than "+num4);
   } else if (num4>num3) {
	   System.out.println(num4+" is the larger than "+num3);
   } else {
	   System.out.println(num3+" is equal to "+num4);
   }
	   

    int day=7;
		
		if (day==1){
			{System.out.println("Monday");
		}
	}else if (day==2){
		{System.out.println("Tuesday");
	}
	
	}else if (day==3) {
		{System.out.println("Wednesday");
	}
	
	}else if (day==4) {
		{System.out.println("Thursday");
	}
	
	}else if (day==5){
		{System.out.println("Friday");
	}
	
	}else if (day==6){
		{System.out.println("Saturday");
	}
	
	}else if (day==7){
		{System.out.println("Sunday");}
	}
		
		
	}
	
	   
	   
   
		
		
		
		
	

}
