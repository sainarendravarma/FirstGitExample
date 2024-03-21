abstract class Friends1 {
	abstract void varma();
	abstract void dharma();
	abstract void dinesh();
}
abstract class Friends3 {
	abstract void varma();
	abstract void dharma();
	abstract void dinesh();
}
class AbstractEx1 extends Friends3{
		
		 public void varma(){
		 System.out.print("Implementation of abstract method");
		 }
		 public void dharma(){
		 System.out.print("Implementation of abstract method");
		 }
		 public void dinesh(){
		 System.out.print("Implementation of abstract method");
		 }
}
class MultiAbstractClasses extends  AbstractEx{
	public static void main(String args[]) {
		AbstractEx1 a=new AbstractEx1();
		a.varma();
	}
}