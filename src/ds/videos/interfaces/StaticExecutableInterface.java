/*
 * Since interface can have static methods we can declare main method
 * Also we can run the interface without implementation
 * 
 */

package ds.videos.interfaces;

public interface StaticExecutableInterface {
	
	public static void main(String[] args) {
		System.out.println("Interface main method");
	}

}
