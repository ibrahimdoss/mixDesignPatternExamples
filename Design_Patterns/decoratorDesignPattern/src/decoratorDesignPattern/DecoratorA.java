package decoratorDesignPattern;

public class DecoratorA implements IComponent{

	private IComponent component ;
	
	public DecoratorA(IComponent c) {
		component = c ; 
	}
	
	//Decorator sınıfı abstract  tanımlamak zorunda.
	
	
	
	@Override
	public double Operation() {
		Component nesneOne = new Component();
		System.out.println("Ön siparişin Toplam Fiyatı Hesaplanıyor.");
		
		double onsiparis = (nesneOne.Operation())-(nesneOne.Operation()* 0.15);
		return onsiparis;
	}

}
