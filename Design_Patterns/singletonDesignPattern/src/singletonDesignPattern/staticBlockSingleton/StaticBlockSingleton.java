package singletonDesignPattern.staticBlockSingleton;

public class StaticBlockSingleton {
	
	private static StaticBlockSingleton singleton ;
	
	static {
		try {
			singleton= new StaticBlockSingleton();
		} catch (Exception e) {
			
			
		}
	}
	
	private StaticBlockSingleton() {
		
	}
	
	public static StaticBlockSingleton getStaticBlockSingleton() {
		return singleton;
	}
	
	public void singletonTest() {
		System.out.println("Staticblock singleton çalıştı.");
	}
}

//burada try-catch ile nesnenin oluşma durumunu kontrol edebileceğiz.