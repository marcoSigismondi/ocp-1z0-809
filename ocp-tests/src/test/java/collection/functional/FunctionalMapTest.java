package collection.functional;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

import org.junit.Test;

public class FunctionalMapTest {

	@Test
	public void testCompute() {
		Map<String, List<String>> genitori = new HashMap<>();
		genitori.put("Fulvia", new ArrayList<>(Arrays.asList("Mauro", "Lucia")));
		genitori.put("Marco", new ArrayList<>(Arrays.asList("Annarita", "Sergio")));
		genitori.put("Emma", new ArrayList<>(Arrays.asList("Marco", "Fulvia")));
		genitori.put("Benni", new ArrayList<>(Arrays.asList("Marco", "Fulvia")));
		
		System.out.println(genitori);
		
		BiFunction<String, List<String>, List<String>> test = (key, list) -> { 
			list.add("Claudio"); 
			return list;
		};
				
		genitori.compute("Fulvia", test);
		assertTrue(genitori.get("Fulvia").contains("Claudio"));
		
		System.out.println(genitori);
		
		Map<String, String> anni = new HashMap<>();
		anni.put("Fulvia", "37");
		anni.put("Marco", "29");
		anni.put("Emma", "4");
		anni.put("Benni", "2");
		
		System.out.println(anni);
		
		BiFunction<String, String, String> anniBifunction = (key, eta) -> eta += " anni";
		BiFunction<String, String, String> mesiBifunction = (key, eta) -> eta += " mesi";
		
		
		anni.compute("Marco", anniBifunction);
		anni.compute("Fulvia", anniBifunction);
		anni.compute("Benni", anniBifunction);
		anni.compute("Emma", mesiBifunction);
		assertTrue(anni.get("Marco").contains("anni"));

		System.out.println(anni);
		
	}

}
