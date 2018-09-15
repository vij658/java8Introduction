package java8youtube.sreams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UToLCase {

	public static void main(String[] args) {
		
		List<String> liString = new ArrayList<String>();
		liString.add("apple");
		liString.add("Bravo");
		liString.add("Charlie");
		liString.add("DELTA");
		
		Function<String, Integer> func = s->s.length();

		Function<String, String> mapper = s->s.toUpperCase();
		Consumer<String> action = (s)->System.out.println(s);;
		liString.stream().map(mapper).forEach(action);
		//or
		System.out.println(liString.stream().map(s->s.toUpperCase()).collect(Collectors.toList()));
		//or
		List<String> collect = liString.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(collect);
		List<Integer> collect1 = liString.stream().map(func).collect(Collectors.toList());
		System.out.println(collect1);
		

	}

}
