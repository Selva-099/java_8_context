package ds.videos.workout;

interface ReferInterface{
	public void interfaceReferMethod();
}
public class MethodReference {
	
	public static void classStaticReferMethod() {
		System.out.println("classReferMethod");
	}
	
	public void classInstanceReferMethod() {
		System.out.println("classInstanceReferMethod");
	}

	public static void main(String[] args) {
		
		//Example for static method reference
		ReferInterface ri = MethodReference :: classStaticReferMethod;
		ri.interfaceReferMethod();// The interfaceReferMethod indirectly refer the classReferMethod using ::
		
		//Example for non-static method reference
		MethodReference mr = new MethodReference();
		ReferInterface ri1 = mr :: classInstanceReferMethod;
		ri1.interfaceReferMethod();
	}

}
