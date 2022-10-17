//3. Write a Java program to divide two numbers and print on the screen.


package javaPrograms;

import java.util.Scanner;

public class ProgramNo3 {

	public static void main(String[] args) {

		float a1;
		float a2;
		float div;
		
		
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("Enter 1st number");
	    
	    a1 = sc.nextFloat();
	    
	    System.out.println("Enter 2nd number");
	    
	    a2 = sc.nextFloat();
	    
	    
	    div = a1/a2;
	    
	    System.out.println("Division Result is" + " " +div);
	    
	    

	}

}
