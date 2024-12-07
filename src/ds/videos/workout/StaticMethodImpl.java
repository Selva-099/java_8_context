/*
 * 
 * The static methods always can call without creating object
 * To call interface static method no need create object for interface or its implementation.
 * 
 * The implementation class cannot override the interface static methods
 * If the implementation class have same kind of method it will act as its own static method
 * 
 */

package ds.videos.workout;

import ds.videos.interfaces.StaticInterface;

public class StaticMethodImpl implements StaticInterface {

	public static void main(String[] args) {
		StaticMethodImpl si = new StaticMethodImpl();
		StaticInterface sit = new StaticMethodImpl();
	
		StaticInterface.staticmethod();
		StaticMethodImpl.staticmethod();
	}
	
	public static void staticmethod() {
		System.out.println("The static method inside the implementation");
	}

}
