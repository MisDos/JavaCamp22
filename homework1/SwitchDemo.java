package homework1;

public class SwitchDemo {

	public static void main(String[] args) {
		char grade = 'E';

		switch (grade) {
		case 'A':
			System.out.println("Perfect you passed, Grade : " + grade);

			break;
		case 'B':
			System.out.println("Wonderful you passed, Grade: " + grade);

			break;
		case 'C':
			System.out.println("Nice you passed, Grade: " + grade);
			break;
		case 'D':
			System.out.println("Not bad you passed, Grade: " + grade);
			break;
		case 'F':
			System.out.println("You stayed, Grade: " + grade);
			break;

		default:
			System.out.println("invalid note");
		}

	}

}
