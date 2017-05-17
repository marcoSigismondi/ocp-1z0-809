package ocp.nested.classes;

public class StaticNestedClass {

	public String fieldOne = "StaticNestedClass.fieldOne";

	public static class PublicStaticClass {

		// legal
		public String fieldOne = "StaticNestedClass.PublicStaticClass.fieldOne";

		private String provateField;

		public void testVisibility() {
			System.out.println(this.fieldOne);
		}

	}

	private static class PrivateStaticClass {
		public String fieldOne;
	}

	public String getFieldOne() {
		StaticNestedClass.PrivateStaticClass test = new StaticNestedClass.PrivateStaticClass();
		return test.fieldOne = "StaticNestedClass.PrivateStaticClass.fieldOne";
	}

}
