import java.util.*;
import java.math.*;
public class Varma_Assignment7 {
long Power(int a,int b) {
	double c =Math.pow(a, b);
	return (long)c;
}
public static void main(String args[]) {
	Varma_Assignment7 v7=new Varma_Assignment7();
	Scanner s= new Scanner(System.in);
	 System.out.println("enter the value of a");
	int a=s.nextInt();
	 System.out.println("enter the value of b");
	int b=s.nextInt();
	long c;
	try {
	if(a==0 && b==0) {
		throw new Exception("n and p should not be zero.");
	}
	else if(a<0 || b<0) {
		throw new Exception(" n or p should not be negative.");
	}
	else {
		 c=v7.Power(a, b);
		 System.out.println(c);
	}
	}
	catch(Exception e) {
		System.out.println(e);
	}
	}
	}

