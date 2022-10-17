import java.util.Scanner;

public class checkAlphabetorNot {

	public static void main(String[] args) {
		// Java Program to Check Alphabet using if else.
		
		
		char ch;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("PLease Enter Character.");
		
		ch=reader.next().charAt(0);
		
		if(ch>='a' && ch<='z' ||ch>='A' && ch<='Z') {
			
			System.out.println("Its Alphabet"+ch);
		}
		else {
			System.out.println("Its not Alphabet"+ch);
			
		}
	}

}
