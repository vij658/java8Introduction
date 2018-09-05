package java8youtube.anonymous;

public class AnonymousWithLambda {

	public static void main(String a[]) {

		// This is an older way of providing anonymous implementation.
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++)
					System.out.println("older imple of thread");
			}
		});
		thread.start();
		
		// using lambda
		Thread thread2 = new Thread(()->{
			for (int i = 0; i < 10; i++)
				System.out.println("lambda imple of thread");
		});
		thread2.start();
		for (int i = 0; i < 10; i++)
			System.out.println("main thread");
	}
	
	

}
