package javaPrograms;

import java.util.Scanner;

public class VowelOrConsentCheck {

	public static void main(String[] args) {
		
		// Java Program to Check Whether an Alphabet is Vowel or Consonant

		
		
		//vowels = a,e,i,o,u
		
		//consent = rather than vowels all letters are consent.
		
	   
		try (Scanner sc = new Scanner(System.in)) {
			
		 char ch = sc.next().charAt(0);
			

			
			
			char ch1 = 'i';
			
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
				
				
				System.out.println("it is Vowel" +ch);
			} 
			
			else {
				
				System.out.println("it is consonent" +ch);
			}
		}
		
		
	}

}
