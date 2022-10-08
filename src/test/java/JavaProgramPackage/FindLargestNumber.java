package JavaProgramPackage;

import java.util.Scanner;

public class FindLargestNumber {

	public static void main(String[] args) {
		// Java Program to Find the Largest Among Three Numbers

		int number1,number2,number3;
		
	    System.out.println("Enter Number 1st");
	    Scanner reader = new Scanner(System.in);
	    
	    number1 = reader.nextInt();
	    
	    System.out.println("Enter Number 2nd");

	    number2 = reader.nextInt();
		 
	    System.out.println("Enter Number 3rd");

	    number3 = reader.nextInt();
	    
	    if(number1>number2 && number1>number3) {
	    	
	    	System.out.println("Number 1st is greatest Number." +number1);
	    	
	    } else if(number2>number1 && number2>number3) {
	    	
	    	System.out.println("Number 2nd is greatest Number."+number2);
	    	
	    }else {
	    	
	    	
	    	System.out.println("Number 3rd is greatest Number."+number3);
	    }
	    
	    

	}

}
