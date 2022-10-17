import java.util.Scanner;

public class CheckLeapYear {

	public static void main(String[] args) {
		// Java Program to Check Leap Year

		//it should be divisible by both 4 and 400 but not divisible by 100 to be a leap year.
		
		
		int year;
		
		System.out.println("Enter a yeat to check it is Leap or not");
		Scanner reader = new Scanner(System.in);
		
		year=reader.nextInt();
		
		if((year%400==0) || (year%100!=0) && (year%4==0)) {
			
			System.out.println("This year is Leap Year.");
			
		} 
		else {
			
			System.out.println("This is not Leap Year.");
		}
		
	}

}
