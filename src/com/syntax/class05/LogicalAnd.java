package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		boolean job= true;
		double salary=186000;
		if(job&& salary>=186000) {
			System.out.println("Iam super duper happy");
		}
		///2
		boolean study=true;
		boolean homeWork=true;
		boolean practice=true;
		
		if(study && homeWork && practice) {
			System.out.println("You will succeed in the course");
		}else {
			System.out.println("You will struggle");
		}
		
		
		
		
		
	
	}

}
