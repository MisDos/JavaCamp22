package homework1;

public class MiniProject {

	public static void main(String[] args) {
		int number=23;
		int remainder=number%2;
		//System.out.println(remainder);
		boolean isPrime=true;
		
		if(number==1) {
			System.out.println("Number is not prime!");
			return;
		}
		if(number<1) {
			System.out.println("invaild number!");
		}
		
		for (int i=2;i<number; i++) {
			if(number%i==0) {
				isPrime=false;
				
				
			}
			
		}
		
		
		if(isPrime) {
			System.out.println("Number is prime!");
			
		}else {
			System.out.println("Number is not prime!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
