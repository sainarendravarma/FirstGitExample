import java.io.*;
import java.lang.reflect.Constructor;
public class SerializationFromInstanceConstructor implements Serializable {
public String name;
public int age;
public float salary;
public String manager;
public String department;
SerializationFromInstanceConstructor(){
	System.out.println("this is default constructor");
}

SerializationFromInstanceConstructor(String name){
	this.name=name;
	
}
SerializationFromInstanceConstructor(String name,int age){
	this.name=name;
	this.age=age;
}
SerializationFromInstanceConstructor(String name,float salary){
	this.name=name;
	this.salary=salary;
}
SerializationFromInstanceConstructor(String name,float salary,String manager,String department){
	this.name=name;
	this.salary=salary;
	this.manager=manager;
	this.department=department;
}
public static void main(String args[]) {
	try {
		Constructor<SerializationFromInstanceConstructor> con = SerializationFromInstanceConstructor.class.getDeclaredConstructor();
		SerializationFromInstanceConstructor a= con.newInstance();
		Constructor<SerializationFromInstanceConstructor> con1 = SerializationFromInstanceConstructor.class.getDeclaredConstructor(String.class);
		SerializationFromInstanceConstructor b= con1.newInstance("varma");
		
		Constructor<SerializationFromInstanceConstructor> con2 = SerializationFromInstanceConstructor.class.getDeclaredConstructor(String.class,int.class);
		SerializationFromInstanceConstructor c= con2.newInstance("varma",20);
		
		Constructor<SerializationFromInstanceConstructor> con3 = SerializationFromInstanceConstructor.class.getDeclaredConstructor(String.class,float.class);
		SerializationFromInstanceConstructor d= con3.newInstance("varma",100000);
		
		Constructor<SerializationFromInstanceConstructor> con4 = SerializationFromInstanceConstructor.class.getDeclaredConstructor(String.class,float.class,String.class,String.class);
		SerializationFromInstanceConstructor e= con4.newInstance("varma",100000,"Murali","IT");
		
		FileOutputStream fout=new FileOutputStream("f3.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(e); 
		FileOutputStream fout1=new FileOutputStream("f4.txt");
		ObjectOutputStream out1=new ObjectOutputStream(fout1);
		out1.writeObject(d); 
		/*
		 * out.flush(); out.flush();
		 */    
		out1.close();
		out1.close();
		System.out.println("sucessfully encrypted");
	}
	catch(Exception e){
		System.out.println(e);
	}
}
}
