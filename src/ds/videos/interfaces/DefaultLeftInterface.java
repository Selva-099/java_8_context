package ds.videos.interfaces;

public interface DefaultLeftInterface {
	
	default void leftInterfaceMethod() {
		System.out.println("Left Interface Default Method");
	}
	
	default void commonInterfaceMethod() {
		System.out.println("Left Common Interface Default Method");
	}

}
