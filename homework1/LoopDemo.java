package homework1;

public class LoopDemo {

	public static void main(String[] args) {
		
		
		//For
		
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
			
		}
		System.out.println("For loop finished!");
		
		
		
		//While
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		System.out.println("While loop finished!");
		
		//Do While
		int j=1;
		do {
			System.out.println(j);
			j+=2;
		}while(j<10);
		System.out.println("Do While loop finished!");

	}
}
