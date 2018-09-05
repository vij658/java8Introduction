package java8youtube.functional;

@FunctionalInterface
public interface MyFunctionalInterface {
	
	public void abstractMethod();
	default public void defaultMethod1(){
		System.out.println("test default method");
	};
}
