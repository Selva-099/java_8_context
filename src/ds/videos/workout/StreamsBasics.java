package ds.videos.workout;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamsBasics {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(10);
		al.add(15);
		al.add(25);
		al.add(20);
		al.add(30);
		
		// Streams to filter the even numbers
		List<Integer> resultList = al.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(resultList);
		
		// Streams to sum number 2 with each numbers
		resultList = al.stream().map(i->i+2).collect(Collectors.toList());
		System.out.println(resultList);
		
		// Streams count method		
		long x = al.stream().filter(i->i%2==0).count();
		System.out.println(x);
		
		// Streams to sorted method (Natural order)
		resultList = al.stream().sorted().collect(Collectors.toList());
		System.out.println("Natural Sort "+resultList);
		
		// Streams to sorted method (Customized order)
		resultList = al.stream().sorted((a,b)->-a.compareTo(b)).collect(Collectors.toList());
		System.out.println("Customized Sort "+resultList);
		
		// Streams to find min element (Customized order)
		Integer min = al.stream().min((a,b)->-a.compareTo(b)).get();
		System.out.println("Min element "+min);
		
		// Streams to find max element (Customized order)
		Integer max = al.stream().max((a,b)->-a.compareTo(b)).get();
		System.out.println("Max element "+max);
		
		//Streams For each method
		al.stream().forEach(System.out::println);
		
		// Convert list into array using streams
		Integer[] array = al.stream().toArray(Integer[] :: new);
		for(Integer i:array)
			System.out.println(i);
		
		// StreamOf() method
		Stream<Integer> si = Stream.of(9,10,13,56);
		si.forEach(System.out :: println);
		
		Double[] d = {3.4, 6.7, 9.1, 1.4};
		Stream<Double> s1 = Stream.of(d);
		s1.forEach(System.out :: println);

		
	}

}
