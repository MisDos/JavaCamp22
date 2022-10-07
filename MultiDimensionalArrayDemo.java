package homework1;

public class MultiDimensionalArrayDemo {

	public static void main(String[] args) {
		String[][] cities = new String[3][3];

		cities[0][0] = "Trabzon";
		cities[0][1] = "Artin";
		cities[0][2] = "Rize";
		cities[1][0] = "istanbul";
		cities[1][1] = "Bursa";
		cities[1][2] = "çanakkale";
		cities[2][0] = "Ankara";
		cities[2][1] = "Konya";
		cities[2][2] = "Kayseri";

		for (int i = 0; i <= 2; i++) {

			System.out.println("-------------");

			for (int j = 0; j <= 2; j++) {

				System.out.println(cities[i][j]);
			}

		}

	}

}
