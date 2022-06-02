package com.syntax.class05;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan= new Scanner(System.in);

      System.out.println("Please enter name");
      String name=scan.next();//capture String next is able only to capture one word 
      System.out.println(name);// to capture all line we will use nextLine();      
      System.out.println("Please enter age");
      int age=scan.nextInt();//capture int
      System.out.println(age);
      
      System.out.println("Please enter price");
      double price=scan.nextDouble();//capture double
      System.out.println(price);
      
      System.out.println("Please enter boolean");
      boolean boo=scan.nextBoolean();//capture boolean
      System.out.println(boo);
      
      System.out.println("Please enter any character");
      char character=scan.next().charAt(0);//capture 1 char zero means char #1 in my word 
      System.out.println(character);
      
      





	}

}
