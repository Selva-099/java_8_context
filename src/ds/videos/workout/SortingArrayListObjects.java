package ds.videos.workout;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayListObjects {

	public static void main(String[] args) {
		
		ArrayList<Integer> numberArray = new ArrayList<>();
		
		numberArray.add(10);
		numberArray.add(0);
		numberArray.add(15);
		numberArray.add(25);
		numberArray.add(20);
		numberArray.add(30);
		
		Collections.sort(numberArray);	// If the Comparator is not passed as argument, the natural sorting will happen
		
		System.out.println("Before sorting - "+numberArray);
		
		numberArray = new ArrayList<>();
		
		numberArray.add(10);
		numberArray.add(0);
		numberArray.add(15);
		numberArray.add(25);
		numberArray.add(20);
		numberArray.add(30);
		
		Collections.sort(numberArray, new MyComparator()); // The Comparator is passed as argument, for customized sorting
		
		System.out.println("After sorting - "+numberArray);
		
		
		/*
		 * Sorting Array List with Lambda expression
		 * The implementation of Comparator is not required (new MyComparator())
		 * Very concise code
		 * 
		 */
		
		
		numberArray = new ArrayList<>();
		
		numberArray.add(10);
		numberArray.add(0);
		numberArray.add(15);
		numberArray.add(25);
		numberArray.add(20);
		numberArray.add(30);
		
		Collections.sort(numberArray, (n1, n2) -> (n1 > n2) ? -1:(n1 < n2) ? 1:0);
		
		System.out.println("Customized sorting using lambda - "+numberArray);

	}

}
