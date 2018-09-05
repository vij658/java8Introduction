package java8youtube.foreach;

import java.util.function.Predicate;

public class TestForEach {
	
	public static void main(String a[]){
		Integer arrayI[] = {1,2,12,15,16,17,5}; 
		//print greater than 10 numbers.
		Predicate<Integer> p = j->j>10;
		for(int i=0;i<arrayI.length;i++){
			System.out.println(p.test(arrayI[i]));
			if(p.test(arrayI[i]))
				System.out.println(arrayI[i]);
		}
		for(int eachValue:arrayI){
			System.out.println(p.test(eachValue));
			if(p.test(eachValue))
				System.out.println(eachValue);
		}
		
		System.out.println("passing predicate func as param");
		TestForEach.testPredicateFunc(p,arrayI);
	}

	public static void testPredicateFunc(Predicate<Integer> p,Integer a[]){
		for(int eachValue:a){
			System.out.println(p.test(eachValue));
			if(p.test(eachValue))
				System.out.println(eachValue);
		}
	}
}
