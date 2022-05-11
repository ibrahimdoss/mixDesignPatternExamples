package singletonDesignPattern.eagerInitialization;

public class EagerInitializationSingleton {
	
	private static final EagerInitializationSingleton INSTANCE = new EagerInitializationSingleton();

    private EagerInitializationSingleton() {
        //buradaki private constructor başka yerlerde direkt new yapılmasını önlüyor.
        //Çağırılırken aşağıdaki methodumuzun üzerinden çağırılma işlemi gerçekleştirilecek.
    }

    public  static EagerInitializationSingleton getInstance(){
         return  INSTANCE;
         // burada static final dediğimiz için uygulama her çalıştığında bu instance otomatik
         //oluşturacaktır o yüzden bu singleton pattern'in dezavantajı.
    }

    public void eagerSingletonDemo(){
        System.out.println("Eager Singleton Çalıştı.");
    }

}
