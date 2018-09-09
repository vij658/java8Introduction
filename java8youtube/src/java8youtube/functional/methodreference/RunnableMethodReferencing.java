package java8youtube.functional.methodreference;

public class RunnableMethodReferencing{
	
	public static void methodReference(){
		for(int i=0; i<10;i++){
			System.out.println("child thread");
		}
	}
	
//	//now using lambda provide an implementation for runnable using lambda and then call it.
	public static void main(String a[]) {
		
		Runnable r1 = RunnableMethodReferencing::methodReference;
		Thread t1 = new Thread(r1);
		t1.start();
		
		// provided an impl and assigned to runnable interface.
//		Runnable r = () -> {
//			for (int i = 0; i < 10; i++)
//				System.out.println("my runnable thread");
//		};
//		// create a thread and start it.
//		Thread t = new Thread(r);
//		t.start();
//		// for demo lets have a main thread
		for (int i = 0; i < 10; i++)
			System.out.println("main thread");
	}
}
