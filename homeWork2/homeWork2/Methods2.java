package homeWork2;

public class Methods2 {

	public static void main(String[] args) {
		String message="The weather is very nice today";
		String newMessage=city();
		System.out.println(newMessage);
		int number=total(6,1);
		System.out.println(number);
		
		
		
		

	}
	
	public static void add() {
		System.out.println("Added");
		
	}
	public static void delet() {
		System.out.println("Deleted");
		
	}
	
	public static void update() {
		System.out.println("Updated");
		
		
	}
	
	public static int total(int number1,int number2) {
		return number1+number2;
		 
		
	}
	
	public static String city() {
		return "Trabzon";
		
		
	}
}
