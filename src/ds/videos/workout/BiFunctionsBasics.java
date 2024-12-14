package ds.videos.workout;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiFunctionsBasics {

	public static void main(String[] args) {
		
		// When we want to pass two arguments to the predicate, functions, consumer
		// we can go with BiPredicate, BiFunction, BiConsumer
		
		BiPredicate<Integer, Integer> bp = (a,b)->(a+b)%2==0;
		
		System.out.println(bp.test(19, 12));
		System.out.println(bp.test(10, 12));
		
		BiFunction<Integer, Integer, Integer> bf = (a,b)->  a*b;
		
		System.out.println(bf.apply(2, 7));
		System.out.println(bf.apply(200, 700));
		
		BiConsumer<Integer, Integer> bc = (a,b)-> System.out.println(a*b);
		
		bc.accept(34, 2);

	}

}
