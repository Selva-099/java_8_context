package ds.videos.workout;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierMethods {

	public static void main(String[] args) {
		
		// Supplier has only return type and it won't accept any input
		
		Supplier<Date> s = ()-> new Date();
		Supplier<String> rn = ()->{
			String[] s1 = {"S","M","K","R"};
			int x = (int)(Math.random()*4);
			return s1[x];
		};
		
		System.out.println(s.get());
		System.out.println(rn.get());

	}

}
