package ds.videos.workout;

import java.util.TreeMap;

public class SortingTreeMapObjects {

	public static void main(String[] args) {
		
		// whenever inserting the element to Tree Map it sorts the object automatically
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		
		treeMap.put(1, "One");
		treeMap.put(4, "Four");
		treeMap.put(6, "Six");
		treeMap.put(1, "Five");
		treeMap.put(3, "Three");
		treeMap.put(2, "Two");
		
		System.out.println("Natural Sorting "+treeMap);
		
		// To sort the Tree Map in customized manner
		treeMap = new TreeMap<>((n1, n2) -> (n1>n2)?-1:(n1<n2)?1:0);
		
		treeMap.put(1, "One");
		treeMap.put(4, "Four");
		treeMap.put(6, "Six");
		treeMap.put(1, "Five");
		treeMap.put(3, "Three");
		treeMap.put(2, "Two");
		
		System.out.println("Customized Sorting with lambda "+treeMap);

	}

}
