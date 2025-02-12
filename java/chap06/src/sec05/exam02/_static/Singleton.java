package sec05.exam02._static;

public class Singleton {

	// 원리(놓?)
//	Singleton singleton = null;
//	
//	Singleton getInstance() {
//		
//		if(singleton == null) {
//			singleton = new Singleton();
//		}
//		
//		return singleton;
//	}
//	
//}
	
	// 실무(놓침)
	private Singleton() {}
	
	static Singleton singleton = new Singleton();
	
}
