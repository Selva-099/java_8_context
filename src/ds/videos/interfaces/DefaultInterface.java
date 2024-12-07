package ds.videos.interfaces;

public interface DefaultInterface {
	
	default void defaultMethod() {
		System.out.println("Default Method inside the interface");
	}
}
