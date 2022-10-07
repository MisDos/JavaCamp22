package homework1;

public class StringsDemo2 {

	public static void main(String[] args) {
		String message="The weather is very nice today..";
		System.out.println(message);
		
		String newMessage=message.replace(' ','-');
		System.out.println(newMessage);
		System.out.println(message.substring(6,8));
		
		for (String word : message.split(" ")) {
			System.out.println(word);
		}
		
		
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		
		//delete the space at the beginning of the sentence
		System.out.println(message.trim());
		

	}

}
