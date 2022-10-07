package javaPrograms;

import java.util.Scanner;

public class CheckOddEvenNumber {

	public static void main(String[] args) {
		
		//Java Program to Check Whether a Number is Even or Odd
		
		int a ;
		
		System.out.println("Enter number");
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		
		if(a%2==0) {
			
			System.out.println("This is Even Number");
		}else {
			
			System.out.println("This is Odd Number");
		}
		

	}

}
