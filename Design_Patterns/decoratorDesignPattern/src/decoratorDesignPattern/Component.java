package decoratorDesignPattern;

public class Component implements IComponent{
	
	public double paket = 353.35 ;
	public double kiyafet = 300.35 ;
	public double binek = 85.35 ;
	public double silah = 123.35 ;

// Decorator isleminin yapılacağı sınıf.
	@Override
	public double Operation() {
		
		double toplam = paket + kiyafet + binek + silah ;
		
		return toplam;
	}
	
	
}
