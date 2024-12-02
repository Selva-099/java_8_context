package ds.videos.workout;

import java.util.TreeSet;

public class SortingTreeSetObjects {

	public static void main(String[] args) {
		
		// whenever inserting the element to Tree set it sorts the object automatically
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(10);
		ts.add(30);
		ts.add(20);
		ts.add(25);
		ts.add(0);
		ts.add(5);
		
		System.out.println("Natural Sorting "+ts);
		
		// To sort the Tree Set in customized manner

		ts = new TreeSet<>((n1, n2) -> (n1>n2)?-1:(n1<n2)?1:0);
		ts.add(10);
		ts.add(30);
		ts.add(20);
		ts.add(25);
		ts.add(0);
		ts.add(5);
		
		System.out.println("Customized Sorting with lambda "+ts);
	}

}
