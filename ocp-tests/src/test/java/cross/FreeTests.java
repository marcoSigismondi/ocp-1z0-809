package cross;

import java.util.OptionalInt;
import java.util.stream.IntStream;

import org.junit.Test;

public class FreeTests {

	@Test
	public void test() {
		IntStream stream = IntStream.builder().add(1).add(2).add(3).build();
		OptionalInt result = stream.filter(input -> input == 1).max();
		result.ifPresent(System.out::println);

	}

}
