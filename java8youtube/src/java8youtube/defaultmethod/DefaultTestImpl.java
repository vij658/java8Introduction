package java8youtube.defaultmethod;

public class DefaultTestImpl implements DefaultMethodTest{
	@Override
	public void defaultTest(){
		System.out.println(" inside default imple");
	}
	
	public static void main(String a[]){
		DefaultTestImpl defaultTestImpl = new DefaultTestImpl();
		defaultTestImpl.defaultTest();
	}

}
