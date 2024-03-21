import java.util.*;
public class ArmstrongExample {
public static void main(String args[]) {
	for(int i=1;i<1000;i++) {
	int x=i;
	int temp=x;
	int rem,sum=0;
	while(x!=0) {
		rem=x%10;
		sum=sum+(rem*rem*rem);
		x=x/10;
	}
	if(temp==sum){
		System.out.println(i+" is armstrong number");
	}
	else {
		System.out.println(i+" is not an armstrong number");

	}
	}
}
}
