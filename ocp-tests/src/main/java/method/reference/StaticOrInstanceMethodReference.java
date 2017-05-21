package method.reference;

public class StaticOrInstanceMethodReference {

	// test with two Consumer<T>

	// static Consumer
	public static void printStatic(final String input) {
		System.out.println("Printing " + input + " in static way!");
	}

	public void printInstance(final String input) {
		System.out.println("Printing " + input + " in instance way!");
	}
}
