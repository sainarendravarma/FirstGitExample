import java.lang.reflect.*;
public class NewInstanceConstructor5 {
public String name;
public int age;
public float salary;
public String manager;
public String department;
NewInstanceConstructor5(){
	System.out.println("this is default constructor");
}

NewInstanceConstructor5(String name){
	this.name=name;
	
}
NewInstanceConstructor5(String name,int age){
	this.name=name;
	this.age=age;
}
NewInstanceConstructor5(String name,float salary){
	this.name=name;
	this.salary=salary;
}
NewInstanceConstructor5(String name,float salary,String manager,String department){
	this.name=name;
	this.salary=salary;
	this.manager=manager;
	this.department=department;
}
public static void main(String args[]) {
	try {
		Constructor<NewInstanceConstructor5> con = NewInstanceConstructor5.class.getDeclaredConstructor();
		NewInstanceConstructor5 a= con.newInstance();
		Constructor<NewInstanceConstructor5> con1 = NewInstanceConstructor5.class.getDeclaredConstructor(String.class);
		NewInstanceConstructor5 b= con1.newInstance("varma");
		System.out.println(b.name);
		Constructor<NewInstanceConstructor5> con2 = NewInstanceConstructor5.class.getDeclaredConstructor(String.class,int.class);
		NewInstanceConstructor5 c= con2.newInstance("varma",20);
		System.out.println(c.name+" "+c.age);
		Constructor<NewInstanceConstructor5> con3 = NewInstanceConstructor5.class.getDeclaredConstructor(String.class,float.class);
		NewInstanceConstructor5 d= con3.newInstance("varma",100000);
		System.out.println(d.name+" "+d.salary);
		Constructor<NewInstanceConstructor5> con4 = NewInstanceConstructor5.class.getDeclaredConstructor(String.class,float.class,String.class,String.class);
		NewInstanceConstructor5 e= con4.newInstance("varma",100000,"Murali","IT");
		System.out.println(e.name+" "+e.salary+" "+e.manager+" "+e.department);
	}
	catch(Exception e){
		
	}
}
}
