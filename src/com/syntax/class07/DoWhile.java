package com.syntax.class07;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=1;
		while(num<=3) {
			System.out.print(num+" ");
			num++;
		}
		System.out.println("---------------");
		 
		int num1= 1;
		do {
			System.out.print(num1+" ");
			num1++;
		}while(num1 <=3);
		System.out.println("------------------");
		// print numbers 1 to 30 using do while
		
		int a = 30;
		do {
			System.out.print(a+" ");
			a--;
		}while(a>=0);
		
		System.out.println("-------------------------------");
		
		//print numbers from 70 to 30
		int b = 70;
		do {
			System.out.print(b+" ");
			b-=2;//68, 66, 64, etc
		}while(b>=30);
		
		
		
		
		
		
		
		
	}

}
