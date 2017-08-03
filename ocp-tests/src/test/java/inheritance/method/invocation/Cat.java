package inheritance.method.invocation;

public class Cat extends Animal {
	
	public String name = "Cat";

	@Override
	public void printType() {
		System.out.println(name);
	}
	
	public void scratch(){
		System.out.println("Auch");
	}
	
	

}
