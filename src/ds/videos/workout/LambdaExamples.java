/*
 * If we want to use Lambda expression we have to use functional interface
 * 
 * 
 */

package ds.videos.workout;

import ds.videos.interfaces.ReturnLength;
import ds.videos.interfaces.SumOfnumbers;

public class LambdaExamples{

	public static void main(String[] args) {
		
		//  Print Hello world using Lambda Expression
		// Genral Way
		
		Runnable r = () -> {System.out.println("Genral Hello World!!!");};
		r.run();
		
		// Somewhat simplified
		
		Runnable r1 = () -> System.out.println("Somewhat Simplified Hello World!!!");
		r1.run();
		
		
		Runnable r2 = () -> {
			System.out.println("Two statement 1.Hello World!!!");
			System.out.println("Two statement 2.Hello World!!!");
		};
		
		r2.run();
		
		//  Print sum of the two values using Lambda Expression
		// Genral Way
		
		SumOfnumbers sn = (int a, int b) -> {System.out.println(a+b);};
		sn.addvalues(10, 13);
		
		// Simplified with type inference
		
		SumOfnumbers sn1 = (a,b) -> System.out.println(a+b);
		sn1.addvalues(17, 13);
		
		// Return length of the String using Lambda Expression
		// Genral Way
		
		ReturnLength rl = (String s) -> { return s.length(); };
		System.out.println(rl.returnLengthOfString("Selvamanikandan"));
		
		// Method return something no need to use the return keyword
		ReturnLength rl1 = (s) ->  s.length();
		System.out.println(rl1.returnLengthOfString("Selvan"));
		
		// Method having single parameter no need to use '()' 
		ReturnLength rl2 =  s ->  s.length();
		System.out.println(rl2.returnLengthOfString("Selva"));
		
		
		
	}

}
