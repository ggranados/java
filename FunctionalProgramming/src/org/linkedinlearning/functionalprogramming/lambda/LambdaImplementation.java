  import java.util.function.Consumer;

public class LambdaImplementation {

	public static void main(String[] args) {

		// Anonymous class, multiple instances	
		System.out.println("\nAnonymous class:");
		for (int i=0; i<5; i++) {
			Consumer<String> myPrinter1 = new Consumer<String>() {
				@Override
				public void accept(String msg) {
					System.out.println("Consuming " + msg);
				}
			};
			myPrinter1.accept(myPrinter1.toString());
		}


	}

}
