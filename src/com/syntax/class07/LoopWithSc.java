package com.syntax.class07;

import java.util.Scanner;

public class LoopWithSc {

	public static void main(String[] args) {
		/*we are going to ask you if you got a job
		 * we will keep asking if you get a job until you say yes
		 * once you say yes--> congratulation
		 */

	Scanner scan =new Scanner(System.in);
		
		String job;
		do {
		System.out.println("Did you get a job");
		job= scan.nextLine();
		}while(!job.equals("yes"));	
		System.out.println("Congratulations");
		
	// another way
		System.out.println("Did you get an offer");
		String offer=scan.nextLine();
		
		while(!offer.equals("yes")) {
			System.out.println("Did you get an offer");
			offer=scan.nextLine();
		}System.out.println("congratulations");
		
		
		
		
		
	}

}
