package ds.videos.interfaces;

public interface DefaultRightInterface {
	
	default void RightInterfaceMethod() {
		System.out.println("Right Interface Default Method");
	}
	
	default void commonInterfaceMethod() {
		System.out.println("Right Common Interface Default Method");
	}

}
