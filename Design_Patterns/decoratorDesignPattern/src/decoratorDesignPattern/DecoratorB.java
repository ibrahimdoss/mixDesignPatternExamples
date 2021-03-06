package decoratorDesignPattern;

public class DecoratorB implements IComponent{
	
	private IComponent component ;
	
	public DecoratorB(IComponent c) {
		component = c;
	}

	@Override
	public double Operation() {
		
		Component nesneOne = new Component();
		
		System.out.println("Premium indirim hesaplanıyor.");
		double premiumSiparis = (nesneOne.Operation())-(nesneOne.Operation()* 0.15)-(nesneOne.Operation()* 0.30);
		System.out.println("Siparişe ön ek indirim ekleniyor...");
		return premiumSiparis;
	}

}
