package method.reference;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class CollectionSortTest {
	
	public class Sorter{
		public int compare(String p1, String p2){
			return -p1.compareTo(p2);
		}
		public int compareTo(String p1, String p2){
			return -p1.compareTo(p2);
		}
		public int metodoAssolutamenteInventato(String p1, String p2){
			return -p1.compareTo(p2);
		}
	}
	
	public static void main(String[] args) {
		List<String> people = Arrays.asList("Marco", "Fulvia", "Emma", "Benni");
		Collections.sort(people, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
			
		});
		
		Collections.sort(people, new CollectionSortTest().new Sorter()::compare);
		Collections.sort(people, new CollectionSortTest().new Sorter()::compareTo);
		Collections.sort(people, new CollectionSortTest().new Sorter()::metodoAssolutamenteInventato);

	}

}
