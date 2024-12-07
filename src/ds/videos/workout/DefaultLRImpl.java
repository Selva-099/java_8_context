/*
 * 
 * When implementing multiple interfaces and both have same methods then compiler will throw error.
 * To avoid the compiler error we have to override the method inside the implementation class
 * 
 */

package ds.videos.workout;

import ds.videos.interfaces.DefaultLeftInterface;
import ds.videos.interfaces.DefaultRightInterface;

public class DefaultLRImpl implements DefaultLeftInterface, DefaultRightInterface {

	public static void main(String[] args) {
		
		DefaultLRImpl di = new DefaultLRImpl();
		di.leftInterfaceMethod();// To call the left interface method
		di.RightInterfaceMethod();// To call the Right interface method
		di.commonInterfaceMethod();// To call the common interface method present in the implementation
		
		

	}
	
	public void commonInterfaceMethod() {
		System.out.println("Common Default Method in implementation");
		
		// To call the any interface common method
		DefaultLeftInterface.super.commonInterfaceMethod();
		DefaultRightInterface.super.commonInterfaceMethod();
	}

}
