
public class MethodOverload {
public int area(int l,int b) {
	System.out.println(l*b);
	return 0;
}
public float area(float l,float b) {
	return (l*b);
}
public static void main(String args[]) {
	MethodOverload m = new MethodOverload();
	float a=m.area(2.3f, 3.4f);
	int b=m.area(2,3);
	System.out.print(a);
}
}

