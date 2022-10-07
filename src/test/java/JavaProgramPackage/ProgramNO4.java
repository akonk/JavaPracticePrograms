

/*
 * 4. Write a Java program to print the result of the following operations.
 * 
Test Data:
a. -5 + 8 * 6
b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3
*/

package javaPrograms;

public class ProgramNO4 {

	public static void main(String[] args) {

		case1();
		case2();
		case3();
		case4();
	}
	
	public static void case1() {
		
	
		
		int a1 = -5;
		int a2 = 8;
		int a3 = 6;
		int result;
		
		result = a1+(a2*a3);
		
		System.out.println(result);
		
		}
	
  public static void case2() {
	
	//(55+9) % 9
	
		int a1 = 55;
		int a2 = 9;
		int a3 = 9;
		int result;
		
		result = (a1+a2) % a3;
		
		System.out.println(result);
		
		}
  public static void case3() {
		
		//c. 20 + -3*5 / 8
		
			int a1 = 20;
			int a2 = -3;
			int a3 = 5;
			int a4 = 8;
			
			int result;
			
			result = a1 + (a2 * a3) / a4;
			
			System.out.println(result);
			
			}
  public static void case4() {
		
		//d. 5 + 15 / 3 * 2 - 8 % 3
		
			int a1 = 5;
			int a2 = 15;
			int a3 = 3;
			int a4 = 2;
			int a5 = 8;
			int a6 = 3;
			
			
			int result;
			
			result = a1 + a2 / a3 * a4 - a5 % a6 ;
			
			System.out.println(result);
			
			}
		

}
