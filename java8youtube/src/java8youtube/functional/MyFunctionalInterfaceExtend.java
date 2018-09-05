package java8youtube.functional;

@FunctionalInterface
public interface MyFunctionalInterfaceExtend extends MyFunctionalInterface{
	
	public void abstractMethod();
	default public void defaultMethod1(){
		System.out.println("test extend default");
	};
}
