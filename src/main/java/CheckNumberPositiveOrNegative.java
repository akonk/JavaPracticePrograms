import java.util.Scanner;

public class CheckNumberPositiveOrNegative {

	public static void main(String[] args) {
		// Java Program to Check Whether a Number is Positive or Negative
		
		double number;
		
		System.out.println("Enter the Number");
		Scanner reader = new Scanner(System.in);
		
		number=reader.nextDouble();
		
		if(number>0.0) {
			
			System.out.println("This is Positive Number" +number);
		}
		else {
			System.out.println("This is Negative Number" +number);
			
		}

	}

}
