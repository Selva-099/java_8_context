package ds.videos.workout;

import ds.videos.interfaces.ThisKeywordInterface;

public class ThisKeywordInLambda {

	int x = 100;

	public void thisKeywordMethod2() {
		int x = 200;// Inside lambda expression it is not possible to declare Instance variable but we can create local one.
		ThisKeywordInterface tki = () -> {
			
			// Inside lambda expression this keyword always refers the instance(class) variable.
			
			System.out.println("X value inside the lambda with this keyword " + this.x);
			System.out.println("X value inside the lambda without this keyword " + x);
		};
		tki.thisKeywordMethod();
	}

	public static void main(String[] args) {

		ThisKeywordInLambda tka = new ThisKeywordInLambda();
		tka.thisKeywordMethod2();

	}

}
