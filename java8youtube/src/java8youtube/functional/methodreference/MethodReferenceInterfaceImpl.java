package java8youtube.functional.methodreference;

public class MethodReferenceInterfaceImpl {

	public void refTest(int i, int j) {
		System.out.println("ref " + i + j);
	}

	public void refTest1(int i, int j) {
		System.out.println(i + j);
	};

	public static void main(String[] args) {
		MethodReferenceInterface methodI = (int i, int j) -> {
			System.out.println(i + j);
		};
		// or
		MethodReferenceInterface methodI1 = (i, j) -> System.out.println(i + j);

		methodI.refTest(10, 1);
		methodI1.refTest(10, 1);
		// testing using ::
		MethodReferenceInterfaceImpl implInstance = new MethodReferenceInterfaceImpl();
		MethodReferenceInterface method2 = implInstance::refTest;
		// method3 wont work because it has to be the same name as in the
		// interface.
		MethodReferenceInterface method3 = implInstance::refTest1;

		method2.refTest(2, 2);
		// method2.refTest1(2, 2);

	}
}
