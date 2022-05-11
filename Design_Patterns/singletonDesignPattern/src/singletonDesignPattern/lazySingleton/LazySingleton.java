package singletonDesignPattern.lazySingleton;

public class LazySingleton {

	private static LazySingleton lazySingleton;
	
	
	private LazySingleton() {
		
	}
	
	public static LazySingleton getLazySingleton() {
		if (lazySingleton==null) 
			lazySingleton=new LazySingleton();
		return lazySingleton;
	}
	public void singletonTest() {
		System.out.println("Lazy Singleton Çalıştı.");
	}
	
}
//burada sadece o nesneye erişim sağlandığında çalıştıracağız.
//burada da yine thread safe sorunu var.