package homework1;

public class ReCapDemo1 {

	public static void main(String[] args) {
		int number1 = 35;
		int number2 = 25;
		int number3 = 61;
		int maxNumber = number1;

		if (maxNumber < number2) {
			maxNumber = number2;

		}
		if (maxNumber < number3) {
			maxNumber = number3;

		}
		System.out.println("The Largest Number: " + maxNumber);
	}

}
