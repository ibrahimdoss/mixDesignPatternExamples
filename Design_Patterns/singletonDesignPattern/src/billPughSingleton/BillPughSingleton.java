package billPughSingleton;

public class BillPughSingleton {
	
	private BillPughSingleton() {
		
	}
	
	public static BillPughSingleton getInstance() {
		return SingletonHelper.Instance;
	}
	
	private static class SingletonHelper {
		private static final BillPughSingleton Instance = new BillPughSingleton();
	}
	
	public void singletonTest() {
		System.out.println("BillPugh Singleton Calisti.");
	}
}

//bu yöntem ise bize loading yaparken zaman kazandırıyor.
//innerclass ile çözüm yapıyoruz.
