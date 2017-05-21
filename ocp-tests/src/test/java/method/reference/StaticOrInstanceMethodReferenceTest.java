package method.reference;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.Test;

public class StaticOrInstanceMethodReferenceTest {

	@Test
	public void test() {
		Stream<String> stream = Arrays.asList("Fulvia", "Marco", "Emma", "Benni").stream();
		// Passing StaticOrInstanceMethodReference.printStatic like Consumer<?
		// super String>
		stream.forEach(StaticOrInstanceMethodReference::printStatic);

		/* ACHTUNG!!! */
		/*
		 * After the execution of a terminal operation like forEach() the stream
		 * is closed! If you attempt to perform another terminal or intermediate
		 * operation you get a java.lang.IllegalStateException: stream has
		 * already been operated upon or closed. NO COMPILER ERROR!!! YOU MUST
		 * recreate the Stream with a source operation BEFORE perfoming any
		 * other operation!!!
		 */

		// Stream.of take varargs!!!
		stream = Stream.of("Fulvia", "Marco", "Emma", "Benni");

		// Passing instance.printInstance like Consumer<? super String>
		// Because printInstance is an instance method is legal to use it in
		// method reference way
		// but it must be used on instance object. Not by Class.
		StaticOrInstanceMethodReference instance = new StaticOrInstanceMethodReference();

		stream.forEach(instance::printInstance);

	}

}
