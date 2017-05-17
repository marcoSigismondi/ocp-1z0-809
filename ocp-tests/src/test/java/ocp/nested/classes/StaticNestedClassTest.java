package ocp.nested.classes;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import ocp.nested.classes.StaticNestedClass.PublicStaticClass;

/**
 * Unit test for simple App.
 */
public class StaticNestedClassTest {

	@Test
	public void testApp() {
		StaticNestedClass test = new StaticNestedClass();
		assertTrue(test.fieldOne.equalsIgnoreCase("StaticNestedClass.fieldOne"));
		StaticNestedClass.PublicStaticClass publicStaticClass = new PublicStaticClass();
		assertTrue(publicStaticClass.fieldOne.equalsIgnoreCase("StaticNestedClass.PublicStaticClass.fieldOne"));
		System.out.println("Inner fieldOne: ");
		publicStaticClass.testVisibility();
		System.out.println("Outer fieldOne: ");
		System.out.println(test.getFieldOne());
	}
}
