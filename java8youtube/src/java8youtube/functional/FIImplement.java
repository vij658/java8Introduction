package java8youtube.functional;

public class FIImplement implements MyFunctionalInterface {

	@Override
	public void abstractMethod() {
		// TODO Auto-generated method stub
		System.out.println(" FIImplement method ");
	}
	
	public static void main(String a[]){
		MyFunctionalInterface testLambda = ()->System.out.println("test lambda");
		FIImplement fiImplement = new FIImplement();
		fiImplement.abstractMethod();
		fiImplement.defaultMethod1();
		testLambda.defaultMethod1();
		testLambda.abstractMethod();

	}

}
