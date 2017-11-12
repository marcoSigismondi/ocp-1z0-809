package assertion;

class A {
	public void getItDone(int counter) {
		assert counter >= 0 : "Less than zero";
		for (int i = 0; i < counter; i++) {

		}
	}
}
