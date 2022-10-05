package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!!");
		
		
		//değişken isimlendirmeleri java'da camelCase yazılır
		String text ="ilginizi çekebilir";
		String text2 ="Vade Süresi";
		
		System.out.println(text);
		
		int vade=12;
		double dollarYesterday=18.30;
		double dollarToday=18.30;
		
		Boolean dollarDown=false;
		
		String arrowDirection="";
		
				
		if (dollarToday<dollarYesterday) {
		arrowDirection="down.svg";
			System.out.println(arrowDirection);
			
		} else if (dollarToday>dollarYesterday) {
		arrowDirection="up.svg";
		System.out.println(arrowDirection);
			
		}
		
		else {
			arrowDirection="equal.svg";
		System.out.println(arrowDirection);
		

		}
		
		String[] krediler= {"Hızlı kredi","Maaşın Halkbanktan","Mutlu Emekli"};
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
			
		}

}
