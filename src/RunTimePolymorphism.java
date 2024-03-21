class Upper{
	void method1() {
		System.out.println("runtime polymorphism upper");
	}
}
public class RunTimePolymorphism extends Upper{
	void method1() {
		System.out.println("Runtime polymorphism child");
		super.method1();

	}
public static void main(String args[]) {
	RunTimePolymorphism r = new RunTimePolymorphism();
	r.method1();
}
}
