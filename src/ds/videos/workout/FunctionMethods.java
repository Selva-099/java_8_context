/*
 * We can combine two functions using function interface default methods
 * Also it has one static method identity()
 * 
 * 
 */


package ds.videos.workout;

import java.util.function.Function;

public class FunctionMethods {

	public static void main(String[] args) {
		
		String str = "selvamanikandan";
		
		Function<String, String> f1 = s->s.toUpperCase();
		Function<String, String> f2 = s->s.substring(0, 9);
		System.out.println("Result of f1 "+f1.apply(str));
		System.out.println("Result of f2() "+f2.apply(str));
		System.out.println("Result of andThen() "+f1.andThen(f2).apply(str));// f1 will apply first and then f2 will apply
		System.out.println("Result of compose() "+f1.compose(f2).apply(str));// f2 will apply first and then f2 will apply
		
		
		Function<Integer, Integer> fi1 = i->i+i;
		Function<Integer, Integer> fi2 = i->i*i*i;
		System.out.println("Result of f1 "+fi1.apply(2));
		System.out.println("Result of f2() "+fi2.apply(2));
		System.out.println("Result of andThen() "+fi1.andThen(fi2).apply(2));// f1 will apply first and then f2 will apply
		System.out.println("Result of compose() "+fi1.compose(fi2).apply(2));// f2 will apply first and then f2 will apply
		
		// Function interface contains one static method identify()
		// The input and return type must be same for the identity() method
		
		Function<String, String> f = Function.identity();
		System.out.println("Result of identity "+f.apply("Selva"));// Identity will return same value passed as input
		
		
		
	}

}
