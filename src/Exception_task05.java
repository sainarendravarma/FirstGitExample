import java.util.*;
public class Exception_task05 {
public static void main(String args[]) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter the number : ");
int check=0;
	int num =s.nextInt();
	int num2=s.nextInt();
	try {
		int div = num/num2;
		System.out.println("the division of num is : "+div);
	}
	catch(ArithmeticException e) {
		System.out.println("exception handled");
		check=1;
	}
	if(check==1)
	{
		num2=10;
		int div =num/num2;
		System.out.println("the division is  : "+div);
	}
}
}
