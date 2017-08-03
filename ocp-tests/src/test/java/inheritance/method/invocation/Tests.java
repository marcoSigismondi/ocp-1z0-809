package inheritance.method.invocation;

import org.junit.Test;

public class Tests {
	
	@Test
	public void testPrintInvocation(){
		Animal animal = new Cat();
		animal.printName();
		animal.printType();
//		animal.scratch(); compilation error. I metodi invocabili sono definiti dal tipo della variabile. La versione invocata è definitia dall'istanza
		Cat cat = new Cat();
		cat.printName();
		cat.printType();
		cat.scratch(); //I metodi invocabili sono definiti dal tipo della variabile. La versione invocata è definitia dall'istanza
	}
}
