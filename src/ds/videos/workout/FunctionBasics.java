package ds.videos.workout;

import java.util.function.Function;

public class FunctionBasics {

	public static void main(String[] args) {

		// Program to remove space in the given String using function

		String str = "It is a good day";

		Function<String, String> f = s -> s.replaceAll(" ", "");

		System.out.println(f.apply(str));

		// Program to find number of space in the given String using function

		Function<String, Integer> f1 = s -> s.length() - s.replaceAll(" ", "").length();

		System.out.println(f1.apply(str));

	}

}
