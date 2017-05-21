import static org.junit.Assert.assertTrue;

import java.util.function.Function;

import org.junit.Test;

public class Tricks {

	@Test
	public void multipleLambdasDeclaration() {

		/* ACHTUNG!!! */
		/*
		 * The trick here is that the code are DECLARING and INITIALIZING THREE
		 * FUNCTION #1: Function<Integer, Integer> negate = (i -> -i); #2:
		 * Function<Integer, Integer> square = (i -> i * i); #3:
		 * Function<Integer, Integer> negateSquare = negate.compose(square);
		 *
		 * like int a = 0, b = 1, c = 2!
		 *
		 */
		Function<Integer, Integer> negate = (i -> -i), square = (i -> i * i), negateSquare = negate.compose(square);
		assertTrue(negateSquare.apply(10).equals(-100));

	}

}
