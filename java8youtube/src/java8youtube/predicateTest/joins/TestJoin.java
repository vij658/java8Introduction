package java8youtube.predicateTest.joins;

import java.util.function.Predicate;

public class TestJoin {
	
	public static void main(String a[]){
		Integer arrayI[] = {1,2,12,15,16,17,5}; 
		Predicate<Integer> p = j->j>10;
		for(int i=0;i<arrayI.length;i++){
			System.out.println(p.test(arrayI[i]));
			if(p.test(arrayI[i]))
				System.out.println(arrayI[i]);
		}
		for(int i:arrayI){
			System.out.println(p.test(arrayI[i]));
			if(p.test(arrayI[i]))
				System.out.println(arrayI[i]);
		}
	}

}
