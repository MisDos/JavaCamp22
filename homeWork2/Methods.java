package homeWork2;

public class Methods {

	public static void main(String[] args) {
		numberPuzzle();
		numberPuzzle();
		numberPuzzle();
		numberPuzzle();
		numberPuzzle();
		

	}
	
	public static void numberPuzzle() {
		int[] numbers= new int[] {1,2,5,7,9,0};
		int toBeSought=3;
		boolean isThere=false;
		
		
		for (int number : numbers) {
			if(number==toBeSought) {
				isThere=true;
				break;
				
			
		}
		}
		
		if(isThere) {
			messageSend("Number available: "+toBeSought);
		}else {
			messageSend("Number not available!: "+toBeSought);
		}
		
		
		}
	
	public static void messageSend(String message) {
			System.out.println(message);
		
	}

}
