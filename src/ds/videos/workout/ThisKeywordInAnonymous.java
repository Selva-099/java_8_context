package ds.videos.workout;

import ds.videos.interfaces.ThisKeywordInterface;

public class ThisKeywordInAnonymous {

	int x = 100;

	public void thisKeywordMethod2() {

		ThisKeywordInterface tki = new ThisKeywordInterface() {
			int x = 200;

			public void thisKeywordMethod() {
				System.out.println("X value inside the inner class " + this.x);//200
			}
		};
		tki.thisKeywordMethod();
	}

	public static void main(String[] args) {

		ThisKeywordInAnonymous tka = new ThisKeywordInAnonymous();
		tka.thisKeywordMethod2();

	}

}
