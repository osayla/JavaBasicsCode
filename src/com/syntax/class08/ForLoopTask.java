package com.syntax.class08;

public class ForLoopTask {

	public static void main(String[] args) {
		//1 print nums from 100 to 1
		for(int i=100; i>=1; i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//2 print even nums from 20 to 1 2ways
		for(int a=20; a>=2; a-=2) {
			System.out.print(a+" ");
		}
		System.out.println();
		for(int b=20; b>=2; b--) {
			if(b%2==0)
			System.out.print(b+" ");
		}
		System.out.println();
		
		//3 print odd nums between 20 and 50 2ways
		 for(int c=21; c<=49; c+=2) {
			 System.out.print(c+" ");
		 }
		 System.out.println();
		 for(int d=21; d<=50; d++) {
			 if(d%2 !=0) {
			 System.out.print(d+" ");
		 }
		}
		 System.out.println();
		 

	}

}
