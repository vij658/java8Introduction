package java8youtube.sreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamFilterCollectEvenNo {

	public static void main(String[] args) {

		Integer a[] = {1,2,3,4,5,6,7,8};
		List<Integer> liInt = new ArrayList<Integer>(Arrays.asList(a));

		System.out.println(liInt);
		
		//without streams.
		Predicate<Integer> p = i->i%2==0; 
		for(int i:a){
			if(p.test(i))System.out.println(i);
		if(i%2==0)System.out.println(i);
		}
		
		//with streams
		System.out.println(liInt.stream().filter(p).collect(Collectors.toList()));
		System.out.println("count "+liInt.stream().filter(p).count());
		
		System.out.println(liInt.stream().sorted().filter(p).collect(Collectors.toList()));

		Comparator<Integer> ctor = (Integer a1, Integer b1)->{
			Integer aa1  = (Integer) a1;
			Integer bb1  = (Integer) b1;
			
			if(bb1>aa1)return 0;
			return 1;
		};
		
		System.out.println("compartor " +liInt.stream().sorted(ctor).collect(Collectors.toList()));

		
//		for(int i:a){
//			ctor.compare(i, i+1);
//		}
		
	}

}
