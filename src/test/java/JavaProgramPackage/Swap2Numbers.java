package javaPrograms;

public class Swap2Numbers {

	
	//Swap two numbers without using 3rd variable.
	
	public static void main(String[] args) {
		
		int numberA = 20; 
		int numberB = 40;
		
	
		
		System.out.println("Before Swapping");
		System.out.println("NumberA=20");
		System.out.println("NumberB=40");
	
		
		numberA=numberA*numberB; //A= 20*40= 800; numberA=800;
		numberB=numberA/numberB; // B= 800/40 = 20; numberB=20;
		numberA=numberA/numberB; // A=  800/200 = 40  numberA=40;
		
		System.out.println("After Swapping");
		System.out.println("NumberA=" +numberA);
		System.out.println("NumberB=" +numberB);
		
				
		
		

	}

}
