package ds.videos.workout;

public class MethodReferenceUSingRunnable {
	
	public void referenceMethod() {
		for(int i=0; i<10;i++)
			System.out.println("Child Thread");
	}

	public static void main(String[] args) {
		
		MethodReferenceUSingRunnable mru = new MethodReferenceUSingRunnable();
		
		Runnable r = mru :: referenceMethod;
		
		Thread t = new Thread(r);
		t.start();
		
		for(int i=0; i<10;i++)
			System.out.println("Main Thread");

	}

}
