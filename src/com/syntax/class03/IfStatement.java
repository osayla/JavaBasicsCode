package com.syntax.class03;

public class IfStatement {

	public static void main(String[] args) {
		/* conditional statement
		*declare a variable rate
		*if rate is more than 5 --> iam not buying a house
		*/
		
		double mortgageRate= 5.5;
		
		if (mortgageRate>5) {
			System.out.println("I am not buying a house");
		}
		
double mortgageRate1= 4.5;
		
		if (mortgageRate1>5) {
		// it will not allow me to go inside the block off code it because itis false
		}
		
		int num1=99;
		int num2=10;
		
		if (num1>num2) {
			System.out.println(num1+" is bigger than "+num2);
		}
		
		/*declare tem.
		 * if temp is higher than 75 -> i will go a walk
		 */
		
		int temp=65;
		if (temp>75) {
			System.out.println("I will go for a walk");
		}else {
			System.out.println("Iam going to study java");
		}
		
		
		char gender = 'f';
		
		if (gender=='f') {
			System.out.println("You like shopping");
		}else {
			System.out.println("You like watching sports");
		}
		
		String browser="chrome";
		
	if (browser.equals("chrome")) {
		System.out.println("All the cases will be executed on chrome");
	}else {
		System.out.println("I am not executing any cases");
			
	}
		
		
		
		
		
		
		
		
		
		

	}

}
