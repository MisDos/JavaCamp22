package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.name = "PC";
		product.id = 61;
		product.description = "Jamirakuaaa PC!";
		product.price = 61500;
		product.stockAmount = 5;
		
		ProdcutManager productManager= new ProdcutManager();
		productManager.Add(product);
		
	
		

	}

}
