package ds.videos.workout;

import java.util.function.Consumer;

public class ConsumerMethods {

	public static void main(String[] args) {
		
		// Consumer Returns nothing
		Consumer<String> c = s->System.out.println("Consumer String: "+s);
		c.accept("Selva");
		
		// Consumer contains default method andThen() used to consumer chaining
		
		Consumer<String> c1 = s->System.out.println("Consumer C1 String: "+s);
		Consumer<String> c2 = s->System.out.println("Consumer C2 String: "+s);
		Consumer<String> c3 = s->System.out.println("Consumer C3 String: "+s);
		
		c1.andThen(c2).andThen(c3).accept("Selvamanikandan");
		
		
	}

}
