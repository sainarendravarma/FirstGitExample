 class SuperClass{
	public void transaction() {
		System.out.println("My ancestor is a cycle who is a vehicle with pedals.");
	}
}
public class Varma_Assignment2 extends SuperClass{
	public void transaction() {
		
		System.out.println("Hello I am a motorcycle, I am a cycle with an engine");
		super.transaction();
	}	
	public static void main(String args[]) {
		Varma_Assignment2 a=new Varma_Assignment2();
		a.transaction();
	}

}
