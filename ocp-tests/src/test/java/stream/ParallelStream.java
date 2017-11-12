package stream;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.Test;

public class ParallelStream {

	@Test
	public void test() {
		System.out.println("----- PARALLEL -----");
		Stream<String> parallelStream = Arrays.asList("a", "b", "c", "d").stream().parallel();
		parallelStream.peek(System.out::println).count();
		
		System.out.println("----- SEQUENZIAL -----");
		Stream<String> stream = Arrays.asList("a", "b", "c", "d").stream();
		stream.peek(System.out::println).count();
	}

}
