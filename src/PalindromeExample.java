import java.util.*;
public class PalindromeExample {
public static void main(String args[]) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter a string");
	String s1=s.nextLine();
	int a=0;
	int k=s1.length();
	int b=k-1;
	int flag=0;
	for (int i=0;i<(k/2);i++) {
		if (s1.charAt(a)==s1.charAt(b)) {
			a++;
			b--;
		}
		else {
			flag++;
			break;
		}
	}
	if(flag==0) {
		System.out.println(s1+" is palindrome");
	}
	else {
		System.out.println(s1+" is not palindrome");
	}
	
}
}
