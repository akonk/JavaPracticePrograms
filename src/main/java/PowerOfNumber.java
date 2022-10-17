
public class PowerOfNumber {

	public static void main(String[] args) {
		// Calculate power of a number using a while loop.
		
		int base = 3, exponent= 4;
		
		long result = 1;
		
		/*
		 * while(exponent!=0) { result *= base; --exponent; }
		 */
		
		/*
		 * for(;exponent!=0;--exponent) {
		 * 
		 * result *= base;
		 * 
		 * }
		 */
		
		// Math.pow() function.
		
        double resultPow = Math.pow(base, exponent);
		
		System.out.println(""+resultPow);

	}

}
