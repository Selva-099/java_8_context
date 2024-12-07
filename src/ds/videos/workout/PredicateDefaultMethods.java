/*
 * 
 * The predicate interface have multiple default methods
 * Those methods negate(), and(), or()
 * These methods helps to join two predicates to check the combination conditions
 * 
 * 
 */

package ds.videos.workout;

import java.util.function.Predicate;

public class PredicateDefaultMethods {

	public static void main(String[] args) {

		int[] x = { 1, 5, 10, 15, 20, 25, 30, 34 };

		Predicate<Integer> findEvenNumbers = n -> n % 2 == 0;
		
		Predicate<Integer> findgreaterNumbers = n -> n > 10;
		
		System.out.println("The Even numbers are");
		iteration(findEvenNumbers, x);
		
		System.out.println("The numbers greater than 10");
		iteration(findgreaterNumbers, x);
		
		System.out.println("The non Even numbers are");
		iteration(findEvenNumbers.negate(), x); // Negate used to apply the NOT in the given condition
		
		System.out.println("The numbers that are even and greater than 10");
		iteration(findEvenNumbers.and(findgreaterNumbers), x);// AND used to check both the conditions are satisfy
		
		System.out.println("The numbers that are even or greater than 10");
		iteration(findgreaterNumbers.or(findgreaterNumbers), x);// OR used to check any of the condition is satisfy
		
		String[] names = {"Mani","Kumar","Karan","Arun","Raj","John","Karthick"};
		System.out.println("The names start with K are");
		Predicate<String> startWithK = s -> s.startsWith("K");
		for(String str:names)
			if(startWithK.test(str))
				System.out.println(str);

	}

	public static void iteration(Predicate<Integer> p, int[] numberArray) {

		for (int i : numberArray)
			if (p.test(i))
				System.out.println(i);
		;

	}

}
