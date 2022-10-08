package homework1;

public class FindNumbers {

	public static void main(String[] args) {
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
			System.out.println("Number available!");
		}else {
			System.out.println("Number not available!");
		}

	}

}
