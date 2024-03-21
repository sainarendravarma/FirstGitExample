
class SumIntegerDivBy9 {
public static void main(String args[]) {
	int sum=0;
	int count=0;
	for(int i=100;i<200;i++) {
		if(i%9==0) {
			sum=sum+i;
			count++;
		}
	}
	System.out.println("the sum is "+sum);
	System.out.println(count+" numbers are divisible by 9 between 100 o 200");
}
}
