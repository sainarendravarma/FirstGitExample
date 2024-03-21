abstract class Friends {
	abstract void varma();
	abstract void dharma();
	abstract void dinesh();
}
class AbstractEx extends Friends{
		
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
class AbstractWantedMethod extends  AbstractEx{
	public static void main(String args[]) {
		AbstractEx a=new AbstractEx();
		a.varma();
	}
}