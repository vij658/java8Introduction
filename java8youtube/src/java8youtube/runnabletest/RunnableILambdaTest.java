package java8youtube.runnabletest;

public class RunnableILambdaTest{ 
//implements Runnable{

//	we usually override the runnable's run and then in main call this.
//	@Override
//	public void run() {
//		for(int i =1;i<=10;i++){
//			System.out.println("my runnable thread");
//		}
//	}
	
//	public static void main(String a[]){
//	RunnableILambdaTest r = new RunnableILambdaTest();
//	Thread t = new Thread(r);
//	t.start();
//	//for demo lets have a main thread
//	for(int i=0;i<10;i++)
//		System.out.println("main thread");
//	}
	
//	//now using lambda provide an implementation for runnable using lambda and then call it.
	public static void main(String a[]) {
		// provided an impl and assigned to runnable interface.
		Runnable r = () -> {
			for (int i = 0; i < 10; i++)
				System.out.println("my runnable thread");
		};
		// create a thread and start it.
		Thread t = new Thread(r);
		t.start();
		// for demo lets have a main thread
		for (int i = 0; i < 10; i++)
			System.out.println("main thread");
	}
}
