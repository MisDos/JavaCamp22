package homeWork2;

public class VariableArguments {

		public static void main(String[] args) {
			String message="The weather is very nice today";
			String newMessage=city();
			System.out.println(newMessage);
			int number=total(6,1);
			System.out.println(number);
			int total2= total2(2,3,4,5,6,7,8);
			System.out.println(total2);
			
			
			
			
			

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
		
		public static int total2(int... numbers) {
			int total=0;
			for(int number:numbers) {
				total+=number;
				
			}
			
			return total;
			
			
			
			
		}
		
		public static String city() {
			return "Trabzon";
			
			
		}
		

	}

