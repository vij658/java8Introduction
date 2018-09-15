package java8youtube.functional.methodreference.constructor;

public class Test {

	public static void main(String[] args) {
		ConstructorInterface constructorInterface = s-> new ConstructorClass(s);
		constructorInterface.get("test constrc");
		
		
		//you cant reference the constructor using a name, instead use new keyword.
		ConstructorInterface constructorInterface2 = ConstructorClass::new;
		constructorInterface2.get("constructor ref");
	}

}
