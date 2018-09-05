package java8youtube.predicateTest;

import java.util.function.Predicate;

public class PredicateLambda {
	
	public static void main(String a[]){
		Predicate<Integer> predicateInt = (Integer i)->{
			if(i>10)
			return true;
			return false;
		};
		
		Predicate<Integer> predicateInt1 =  i->(i>10);
		
		System.out.println(predicateInt.test(11));
		System.out.println(predicateInt.test(10));
		System.out.println(predicateInt1.test(11));
		System.out.println(predicateInt1.test(10));
		
		Predicate<String> predicateString = s->(s.length()>5);
		System.out.println("string length >5" + predicateString.test("sdfsdafsdfaasdf"));
		System.out.println("string length <5" + predicateString.test("10"));
	}

}
