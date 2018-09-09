package java8youtube.add;

public class AddImplement {
	public static void main(String a[]){
		AddInterface addInterface = (x,y)->System.out.println("sum is: "+(x+y));
		//or
		AddInterface addInterface1 = (int x,int y)->System.out.println("sum is: "+(x+y));
//		addInterface.abstractMethod(a, b);
//		AddImplement addImplement = new AddImplement();
		addInterface.abstractMethod(5, 6);
		addInterface1.abstractMethod(5, 6);
	}

}
