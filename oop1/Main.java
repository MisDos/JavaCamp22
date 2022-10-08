package oop1;

import java.awt.image.CropImageFilter;

public class Main {

	public static void main(String[] args) {
		
		Product product1=new Product();
		product1.setName("Hawakiii Kahve Makinesi ");
		product1.setDiscount(7);
		product1.setUnitPrice(8500);
		product1.setUnitsInStock(4);
		product1.setImageUrl("image6.jpg");
		
		
		Product product2=new Product();
		product2.setName("Jamira Kua Kahve Makinesi ");
		product2.setDiscount(3);
		product2.setUnitPrice(4500);
		product2.setUnitsInStock(4);
		product2.setImageUrl("image2.jpg");
		
		
		Product product3=new Product();
		product3.setName("Kuwauyke Kahve Makinesi ");
		product3.setDiscount(8);
		product3.setUnitPrice(9500);
		product3.setUnitsInStock(5);
		product3.setImageUrl("image3.jpg");
		
		
		
		Product[] products= {product1,product2,product3,};
		
		
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>"+product.getName()+"</li>");
		}
		
		System.out.println("</ul>");
		
		
		IndividualCustomer individualCustomer=new IndividualCustomer();
				individualCustomer.setId(1);
				individualCustomer.setCustomerNumber("05525552211");
				individualCustomer.setCustomerNumber("123555");
				individualCustomer.setFristName("Cafer");
				individualCustomer.setLastName("Sesver");
				
				CorporateCustomer corporateCustomer=new CorporateCustomer();
				corporateCustomer.setId(5);
				corporateCustomer.setPhone("0561616161");
				corporateCustomer.setTaxtNumber("666111661");
				corporateCustomer.setCompanyName("Kagawaaa");
				corporateCustomer.setCustomerNumber("8523991235323");
				
				
				Customer[] customers= {individualCustomer,corporateCustomer };
				
				
				
				
		
		
		
	
		
		 
		

	}

}
