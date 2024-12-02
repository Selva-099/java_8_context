package ds.videos.workout;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListSetMapBasics {

	public static void main(String[] args) {
		
		/*
		 * List is insertion order preserved
		 * It allows duplicate objects
		 */
		List<String> a1 = new ArrayList<String>();
		a1.add("Tamil");
		a1.add("Hindi");
		a1.add("English");
		a1.add("Tamil");
		
		System.out.println(a1);
		
		/*
		 * Set the order is not preserved
		 * It doesn't allows duplicate objects
		 */
		Set<Integer> h1 = new HashSet<>();
		h1.add(84);
		h1.add(24);
		h1.add(30);
		h1.add(99);
		h1.add(84);
		
		System.out.println(h1);
		
		// When adding duplicate keys then the value will be overwritten
		Map<Integer, String> hm1 = new HashMap<>();
		
		hm1.put(1, "One");
		hm1.put(4, "Four");
		hm1.put(6, "Six");
		hm1.put(1, "Five");
		hm1.put(3, "Three");
		hm1.put(2, "Two");
		
		System.out.println(hm1);
		

	}

}
