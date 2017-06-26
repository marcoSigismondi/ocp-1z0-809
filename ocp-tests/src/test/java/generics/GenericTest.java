package generics;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class GenericTest {
	
	public class Person{

		String name;
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		public Person(String name) {
			super();
			this.name = name;
		}
	}
	
	//Non è possibile modificare una lista generica. Il compilatore non ha modo di sapere
	//che tipo di oggetto vi si trova all'interno
	/*public List<Person> badGeneric(ArrayList<? extends Person> strList){
			List<? extends Person> list = new ArrayList<>();
			list.addAll(strList);
			return list;
	}*/
	
	//E' possibile invocare un metodo della classe padre
	public void goodGeneric(List<? extends Person> input){
		List<? extends Person> list = new ArrayList<>();
		for (Person person : list) {
			System.out.println(person.getName());
		}
	}

	@Test
	public void test() {
		Person person = new Person("Marco");
		
		//Nonostante non sia possibile aggiungere un oggetto di tipo figlio in una
		//lista generica <? super Person> è possibile aggiungerlo in una di tipo <? extends Person>
		//Questo perché essendo la lista creata per poter accogliere qualsiasi oggetto gerarchicamente superiore
		//all'oggetto inserito
		List<? super Person> superList = new ArrayList<>();
		List<? extends Person> extendsList = new ArrayList<>();
//		extendsList.add(person);
		superList.add(person);
		
		
		goodGeneric(extendsList);
	}

}
