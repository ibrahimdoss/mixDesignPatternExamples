package threadSafeSingleton;


public class ThreadSafeSingleton {
	
	private static ThreadSafeSingleton threadSafeSingleton;
	
	private ThreadSafeSingleton() {
		
	}
	
	public static synchronized  ThreadSafeSingleton geThreadSafeSingleton() {
		if (threadSafeSingleton==null) 
			threadSafeSingleton=new ThreadSafeSingleton();
		return threadSafeSingleton;
	}
	//multithread çalıştığını düşündüğümüzde synchronized kullanırız. iki thread getlediği zaman
	// sırayla threadleri getler bunu yapmamızı da (synchronized) ile kolaylaştırıyoruz.
	
	public void singletonTest() {
		System.out.println("ThreadSafe Singleton Calıstı.");
	}

}
