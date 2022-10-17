
public class ReverseNumber {

	public static void main(String[] args) {
		//Java Program to Reverse a Number.
		
		
		int num = 123456789;
		
		int reverseNum=0;
		
		/*
		 * while(num!=0) {
		 * 
		 * 
		 * int lastDigit = num%10;
		 * 
		 * reverseNum = reverseNum*10 +lastDigit;
		 * 
		 * num/=10;
		 * 
		 * }
		 */
		
		 for(;num!=0;num/=10) {
			 
			int lastDigit =num%10;
			
			reverseNum=(reverseNum*10)+ lastDigit;
			
		 }
		System.out.println(""+reverseNum);
		
		
			
	

}
}
