package ds.videos.workout;

public class LambdaReplaceAnonymous {

	public static void main(String[] args) {
		
		// The anonymous inner class was replaced with Lambda expression
		Runnable r = ()->{
			for(int i=0; i<10;i++) {
				System.out.println("Child Thread");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
		
		// We can directly use the lambda while creating the thread 
		
		Thread t1 = new Thread(()->{
			for(int i=0; i<10;i++) 
				System.out.println("Child Thread");
		});
		t1.start();
		
		for(int i=0;i<10;i++) 
			System.out.println("Main Thread");
		

	}

}
