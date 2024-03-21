import java.util.*;
class MyException extends Exception{
}
public class Exception_task01 extends MyException {
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	boolean b=false;
	while(!b) {
	try {
		
		String s1=s.nextLine();
		int s2=Integer.parseInt(s1);
		if(s2<0) {
			throw new MyException();
		}
		else {
			System.out.println(100/s2);
		}
		b=true;
		}
	
	catch(NumberFormatException n) {
			System.out.println("strings are not accepted");
		}
	catch(ArithmeticException e) {
			System.out.println("the number cannot be zero");
			System.out.println("please enter anther number");
		}
	catch(MyException e) {
			System.out.println("the number cannot be negative");
		}
	}}}
	

