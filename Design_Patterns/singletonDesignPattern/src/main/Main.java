package main;

import billPughSingleton.BillPughSingleton;
import singletonDesignPattern.eagerInitialization.EagerInitializationSingleton;
import singletonDesignPattern.lazySingleton.LazySingleton;
import singletonDesignPattern.staticBlockSingleton.StaticBlockSingleton;
import threadSafeSingleton.ThreadSafeSingleton;

public class Main {

	public static void main(String[] args) {
		  //Eager_Initialization eager_initialization= new Eager_Initialization();
        // yukarıda singleton kuralımıza uygun olduğu için newlemeye izin vermiyor.
        //newlemek yerine class içindeki method üzerinden çağırma işlemi yapıyoruz.

	 
	 EagerInitializationSingleton.getInstance().eagerSingletonDemo();
	 
	 StaticBlockSingleton.getStaticBlockSingleton().singletonTest();
	 
	 LazySingleton.getLazySingleton().singletonTest();
	 
	 ThreadSafeSingleton.geThreadSafeSingleton().singletonTest();
	 
	 BillPughSingleton.getInstance().singletonTest();

	}

}
