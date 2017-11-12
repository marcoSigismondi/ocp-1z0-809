package collection.utils;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.Test;

public class BinarySearchTest {

	@Test
	public void binarySearchTest() {
		String[] famiglia = {"Marco", "Fulvia", "Emma", "Benni"};
		int foundResult = Arrays.binarySearch(famiglia, "Marco");
		Stream.of(famiglia).forEach(System.out::println);
		System.out.println("Not ordered: " + foundResult);
		
		Arrays.sort(famiglia);
		foundResult = Arrays.binarySearch(famiglia, "Marco");
		Stream.of(famiglia).forEach(System.out::println);
		System.out.println("Ordered: " + foundResult);
		
		foundResult = Arrays.binarySearch(famiglia, "Benni");
		Stream.of(famiglia).forEach(System.out::println);
		System.out.println("First place: " + foundResult);
		
		foundResult = Arrays.binarySearch(famiglia, "Zio");
		Stream.of(famiglia).forEach(System.out::println);
		System.out.println("Not present: " + foundResult);
		
		int[] intArray = {1, 2, 1};
		foundResult = Arrays.binarySearch(intArray, 1);
		Stream.of(intArray).forEach(System.out::println);
		System.out.println("Present more than one: " + foundResult);
		
	}

}
