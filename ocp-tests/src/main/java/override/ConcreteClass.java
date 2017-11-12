package override;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ConcreteClass implements FirstInterface, SecondInterface{

	@Override
	public void test() throws FileNotFoundException {
		// Con exception non compila perché non si può inserire una eccezione padre
		
	}

}
