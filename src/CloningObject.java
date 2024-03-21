
import java.lang.reflect.Constructor;
public class CloningObject implements Cloneable{
public String name;
public int age;
public float salary;
public String manager;
public String department;
CloningObject(){
	System.out.println("this is default constructor");
}

CloningObject(String name){
	this.name=name;
	
}
CloningObject(String name,int age){
	this.name=name;
	this.age=age;
}
CloningObject(String name,float salary){
	this.name=name;
	this.salary=salary;
}
CloningObject(String name,float salary,String manager,String department){
	this.name=name;
	this.salary=salary;
	this.manager=manager;
	this.department=department;
}
public static void main(String args[]) {
	try {
		Constructor<CloningObject> con = CloningObject.class.getDeclaredConstructor();
		CloningObject a= con.newInstance();
		Constructor<CloningObject> con1 = CloningObject.class.getDeclaredConstructor(String.class);
		CloningObject b= con1.newInstance("varma");
		CloningObject b1=(CloningObject)b.clone();
		System.out.println(b.name);
		System.out.println(b1.name);
		Constructor<CloningObject> con2 = CloningObject.class.getDeclaredConstructor(String.class,int.class);
		CloningObject c= con2.newInstance("varma",20);
		CloningObject c1=(CloningObject)c.clone();
		System.out.println(c.name+" "+c.age);
		System.out.println(c1.name+" "+c1.age);
		Constructor<CloningObject> con3 = CloningObject.class.getDeclaredConstructor(String.class,float.class);
		CloningObject d= con3.newInstance("varma",100000);
		CloningObject d1=(CloningObject)d.clone();
		System.out.println(d.name+" "+d.salary);
		System.out.println(d1.name+" "+d1.salary);
		Constructor<CloningObject> con4 = CloningObject.class.getDeclaredConstructor(String.class,float.class,String.class,String.class);
		CloningObject e= con4.newInstance("varma",100000,"Murali","IT");
		CloningObject e1=(CloningObject)e.clone();
		System.out.println(e.name+" "+e.salary+" "+e.manager+" "+e.department);
		System.out.println(e1.name+" "+e1.salary+" "+e1.manager+" "+e1.department);
		System.out.println("------------------------clone method() done--------------------------------");
		
	
	
	}
	catch(Exception e){
		
	}
}
}
