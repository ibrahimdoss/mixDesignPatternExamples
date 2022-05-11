package builderDesignPattern;

import java.time.LocalDateTime;

public class Run {

	public static void main(String[] args) {
		
		Product product1= new Product();
		product1.setId(12L);
		product1.setDescription("Description");
		product1.setName("Name");
		//builder yapısı biz propertylerin sadece 3 tanesi ya da 4 tanesi
		// ile çalışacaksak bunu 20 yerde de kullansak bu bize write ederken 
		//yani set ederken bize kalabalık bir kod oluşturur.
		//builder yapısı buna çözüm buluyor .
		
		
		Product product2 = new Product.ProductBuilder()
				.id(12L)
				.name("Name")
				.description("desc")
				.build();
		
		
		System.out.println(product1);
		System.out.println(product2);
		
		/*
		 * ProductLombok lombokInstance = ProductLombok.builder() .id(12L) .name("name")
		 * .description("description") .build();
		 * 
		 * System.out.println(lombokInstance);
		 */
		
		// lombok ile run kısmı da bu şekilde çalışıyor.
	}
// burada build dediğimizde doldurduğumuz nesneleri arka planda product nesnesine doldurup o nesneyi de 
	//geri dönderip bize veriyor. Bu durumda product2 de sadece doldurduğumuz nesneler var.
	
	
}
