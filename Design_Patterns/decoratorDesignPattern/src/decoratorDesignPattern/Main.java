package decoratorDesignPattern;

public class Main {

	public static void main(String[] args) {
		
		IComponent component = new Component();
		
		DecoratorA decoratorA = new DecoratorA(component);
		
		DecoratorB decoratorB = new DecoratorB(component);
		
		System.out.println(component.Operation());
		System.out.println(decoratorA.Operation());
		System.out.println(decoratorB.Operation());
				
	}

}

//Decorator design pattern önce base bir interface ya da abstract oluştururuz tüm sınıflar bunu implement etmek zorundadır.
//sonra bu interface'i kullanacak bir class açarız buraya işlemleri yapacağımız yer olarak kullanırız.
// ardından kullanacak işlemlerde implement edip mevcuttaki kodu bozmadan gelen değişikliği çok çabuk sisteme ekleyebiliriz.
// Open-Closed Prensibine uygun olan bir patterndir. (  sınıfların geliştirilmeye açık olması, değiştirilmeye kapalı olması demektir.)

/*
 * Burada yaptığımız işlemlerde ise önce IComponent diye bir interface açtık
 * sonra ise bu soyutu kullanacak bir somut class yani Component diye sınıf
 * açtık. Bu sınıfın içinde siparişlerin işlemlerini tanımladık. Ardından ön
 * sipariş ve premium sipariş tarzında iki tane sınıf oluşturduk bunlar
 * interface'imizi implement etti ve işlemleri içlerine aktardık sadece indirim
 * oranını ekledik mevcuttaki değişikliğimize dokunmadık.
 *** 
 * BU patterni her geliştirmede kullanırsak da kod karmaşıklığını unutmamak
 * lazım.
 */
