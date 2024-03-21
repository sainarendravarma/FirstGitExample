
interface interface1 {  
    void method1();  
}  
  
interface interface2 {  
    void method2();  
}  
  
class Example1 implements interface1, interface2 {  
    public void method1() {  
        System.out.println("method1 of example1");  
    }  
  
    public void method2() {  
        System.out.println("method2 of example1");  
    }  
}  
  
class Example2 implements interface1, interface2 {  
    public void method1() {  
        System.out.println("method1 of example2");  
    }  
  
    public void method2() {  
        System.out.println("method2 of example2");  
    }  
}  
  
public class MultipleInheritance extends Example1{  
    public static void main(String[] args) {  
    	MultipleInheritance e =new MultipleInheritance();
         e.method1();
    }  
}  