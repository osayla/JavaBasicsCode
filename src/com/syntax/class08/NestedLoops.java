package com.syntax.class08;

public class NestedLoops {

	public static void main(String[] args) {
		// loop inside another loop
		for(int i=1; i<=3; i++) {// outer loop
			System.out.print("Hello ");
			for(int y=1; y<=2; y++) {//nested loop
				System.out.print("Bye ");
			}
		}
		System.out.println("-----------------------------------");
		
		for (int i=1; i<=3; i++) {
			System.out.print(i+" ");
			for(int y=1; y<=2; y++) {
				System.out.print(y+" ");
			}
		}
		System.out.println("-----------------------------------");
		
		for (int i=1; i<=3; i++) {
			
			for(int y=1; y<=2; y++) {
				System.out.print(i+" "+y+" ");
			}
		}
		System.out.println("--------------------------------------");
		
		for (int i=1; i<=3; i++) {
			System.out.print("Hello ");
			for(int y=1; y>=2; y++) {
				System.out.print("Bye  ");
			}
		}
		System.out.println("--------------------------------------");

		for (int i=1; i>3; i--) {
			System.out.print("Hello ");
			for(int y=1; y<=2; y++) {
				System.out.print("Bye  ");
	}
		}
	}}
