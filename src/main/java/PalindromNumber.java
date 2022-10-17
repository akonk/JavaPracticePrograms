import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		// Java Program to Check Palindrome Number
		
		int num = 121 ;
		int originalNum = num;
		
		System.out.println("Enter Number");
		
		/*
		 * Scanner reader = new Scanner(System.in);
		 * 
		 * num=reader.nextInt();
		 */
		
		int reverseNum=0;
		
		
		for(;num!=0;num/=10) {
			
			
			int lastdigit = 0;
			lastdigit=num%10;
			reverseNum = (reverseNum*10)+ lastdigit;
		}
     
		  System.out.println(""+reverseNum);
		  
		  if(originalNum==num) {
			  System.out.println("This is Palindrom Number" +num);
		  }
		  else {
			  System.out.println("This is not Palindrom Number."+num);
		  }
	}

}
