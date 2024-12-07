/*
 * 
 * Predicate is functional interface
 * It accepts lambda expressions
 * 
 */



package ds.videos.workout;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class PredicateBasic {

	public static void main(String[] args) {
		
		// Write a predicate to check whether the given number is greater than 10
		
		Predicate<Integer> p = I->I>10;
		System.out.println("Given number is greater than 10 "+p.test(100));
		System.out.println("Given number is greater than 10 "+p.test(5));
		
		// Write a predicate to check whether the given string length is greater than 5
		
		Predicate<String> ps = s->s.length() > 5;
		System.out.println("Given string length is greater than 5 "+ps.test("Selva"));
		System.out.println("Given string length is greater than 5 "+ps.test("Selvan"));
		
		// Write a predicate to check whether the given collection is empty or not
		
		Predicate<Collection<String>> pc = c->c.isEmpty();
		
		ArrayList<String> al1 = new ArrayList<>();
		ArrayList<String> al2 = new ArrayList<>();
		
		al1.add("Selva");
		
		System.out.println("Given collection is empty or not "+pc.test(al1));
		System.out.println("Given collection is empty or not "+pc.test(al2));

	}

}
