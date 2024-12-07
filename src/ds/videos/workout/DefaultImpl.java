/*
 * When implementing the interface which have default methods
 * the default automatically available to the implementation class
 * Also It can be overridden
 * 
 */

package ds.videos.workout;

import ds.videos.interfaces.DefaultInterface;


public class DefaultImpl implements DefaultInterface {

	public static void main(String[] args) {
		
		DefaultImpl di = new DefaultImpl();
		di.defaultMethod(); // If the interface default method is not override then the class object will refer interface method.
	}
	
	
	
	//If the interface default method is override then the class object will refer overridden method.
	public void defaultMethod() {
		System.out.println("Default Method inside the implementation class");
	}

}
