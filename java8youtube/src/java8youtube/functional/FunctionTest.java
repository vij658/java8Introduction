package java8youtube.functional;

import java.util.function.Function;

public class FunctionTest {
	public static void main(String a[]){
	Function<String, Integer> func = s->s.length();
	System.out.println(func.apply("sankarwrerwerwer12312"));
	}
}
