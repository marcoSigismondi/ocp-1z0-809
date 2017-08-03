package inheritance.method.invocation;

public abstract class Animal {

	public String name = "Generic animal";
	public String type = "Animal";
	
	public void printName(){
		System.out.println(name);
	}
	
	public void printType(){
		System.out.println(type);
	}
}
