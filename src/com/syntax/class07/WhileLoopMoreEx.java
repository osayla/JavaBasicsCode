package com.syntax.class07;

public class WhileLoopMoreEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//print numbers from 1 to 10
		int num=1;
		while(num<=10) {
			System.out.print(num+" ");
			num++;
		}
		int a= 10;
		while(a<=10) {
			System.out.print(a+" ");
			a++;
		}
		//print numbers from 10 to 1;
		System.out.println();
		int b= 10;
		while(b>=1) {
			System.out.print(b);
			b--;
		}
		// from 100 to 50
	
	int h=100;
	while(h>=50) {
		System.out.print(h+" ");
		h--;
	}
	// from-1 to -10
	int d=-1;
	while(d>=-10) {
		System.out.print(d+" ");
		d--;
	}
	
	// print from 1to 20 but only even numbers
	
	int e = 2;
	while (e<=20) {
		System.out.println(e+" ");
		e+=2;
	}
	System.out.println(" ");
	
	// another way for the even number
	int f= 1;
	while(f<=20) {
		
		if(f%2==0) {
		System.out.print(f+" ");
		}f++;
	}
	}
	
	
	
	
	
	
	
	

}
