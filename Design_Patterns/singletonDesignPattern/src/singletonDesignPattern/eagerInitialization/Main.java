package singletonDesignPattern.eagerInitialization;

import singletonDesignPattern.staticBlockSingleton.StaticBlockSingleton;

public class Main {

	public static void main(String[] args) {
		 

		        //Eager_Initialization eager_initialization= new Eager_Initialization();
		        // yukarıda singleton kuralımıza uygun olduğu için newlemeye izin vermiyor.
		        //newlemek yerine class içindeki method üzerinden çağırma işlemi yapıyoruz.
			 
			 EagerInitializationSingleton.getInstance().eagerSingletonDemo();
			 
			 StaticBlockSingleton.getStaticBlockSingleton().singletonTest();

			 
			 
 }
}