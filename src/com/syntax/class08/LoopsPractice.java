package com.syntax.class08;

public class LoopsPractice {

	public static void main(String[] args) {
		// 

		int sum=0;
		for (int i=1; i<6; i++) {
			sum+=i;
		}System.out.println(sum);//1 3 6 10 15
		
	/* write a program to find sum of all odd numbers
	 * from 1 to 70	
	 */
		int sum1=0;
		for(int i=1; i<=70; i++) {
			if(i%2 !=0) {
				sum1+=i;
			}}System.out.print(sum1+" ");
		 System.out.println();
		
		int sum2=0;
		for(int i=1; i<=70; i++) {
			if(i%2==0) {
				sum2+=i;}
		}System.out.print(sum2+" ");
		
		//
		int sumEven=0;
		int sumOdd=0;
				
		for (int i=1; i<=70; i++) {
			if (i%2 == 0) {
				sumEven +=i;
			} else {
				sumOdd +=i;
			}			
		}
		System.out.println("Sum even numbers is "+sumEven);
		System.out.println("Sum odd numbers is "+sumOdd);
		
		
		
		
		
		
		
		
	}

}
