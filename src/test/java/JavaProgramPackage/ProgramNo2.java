

//2. Write a Java program to print the sum of two numbers.

package javaPrograms;

import java.util.Scanner;

public class ProgramNo2 {

	public static void main(String[] args) {

     int a1;
     int a2;
     int sum;
     
     
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter one number");
     
    a1 = sc.nextInt();
	
    System.out.println("Enter Two number");
    
    a2 = sc.nextInt();
    
    sum = a1+a2;
    
    System.out.println("Result"  + " " +sum);
    
    
	}

}
