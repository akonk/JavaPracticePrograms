package javaPrograms;

import java.util.Scanner;

public class MultiplyTwoFloatingPointNumbers {

	
	public static void main(String[]args) {
		
		Float a ,b, result;
		
		System.out.println("Enter 1st Number");
		Scanner sc= new Scanner(System.in);
		
		a=sc.nextFloat();
		System.out.println("Enter 1st Number");
		b=sc.nextFloat();
		
		result=a*b;
		System.out.println(" Result:- "+result);
		
		
		
	}
	
}
