package ds.videos.workout;

interface ConstructorReferInterface{
	public ConstructorRefernceSample interfaceReferMethod();
}

public class ConstructorReference {

	public static void main(String[] args) {
		
		ConstructorReferInterface ri = ConstructorRefernceSample :: new;
		ConstructorRefernceSample cr = ri.interfaceReferMethod();
		
		cr.nonConstructorRefernceSample();
		
	}

}
