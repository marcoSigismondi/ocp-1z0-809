package cross;

import static org.junit.Assert.*;

import java.util.OptionalInt;
import java.util.stream.Stream;

import org.junit.Test;

public class StreamCompendium {

	@Test
	public void test() {
		String mamma = "Fulvia";
		String papa = "Marco";
		String piccola = "Emma";
		String micio = "Benni";
		
		/*STREAM SOURCE*/
		/*Create a Stream by builder*/
		Stream.Builder<String> builder = Stream.builder() ;
		Stream<String> parents = builder.add(mamma).add(papa).build();
		
		/*Create a Stream by list of args to Stream.of static method*/
		Stream<String> sons = Stream.of(piccola, micio);
		
		Stream<String> family = Stream.concat(parents, sons);
		
		/*INTERMEDIATE OPERATION*/
		OptionalInt result = family
			.peek(System.out::println)
			.map(input -> input.toUpperCase())			//every item is transformed in uppercase
			.peek(System.out::println)					//every item is printed
			.filter(input -> !input.startsWith("Ma"))	//every item starting with "Ma" is elieminated
			.peek(System.out::println)					//every item is printed
			.mapToInt(input -> input.length())			//every input is transformed in its length
			.max();										//TERMINAL OPERATION: the max length in selected e is returned an OptionalInt
			
		result.ifPresent(System.out::println);
		
		assertNotNull(result);
		
	}

}
