//Java Serialization with Inheritance (IS-A Relationship)
import java.io.Serializable;
import java.io.*;
class Person implements Serializable{    
 int id;    
 String name;    
 Person(int id, String name) {    
  this.id = id;    
  this.name = name;    
 }    
}    
class Student1 extends Person{    
 String course;    
 int fee;    
 public Student1(int id, String name, String course, int fee) {    
  super(id,name);    
  this.course=course;    
  this.fee=fee;    
 }    
}    
public class SerializationExampleInheritance  
{    
 public static void main(String args[])  
 {    
    try{    
  Student1 s1 =new Student1(211,"ravi","Engineering",50000); 
  FileOutputStream fout=new FileOutputStream("f1.txt");    
  ObjectOutputStream out=new ObjectOutputStream(fout);    
  out.writeObject(s1);    
  out.flush();       
  out.close();    
  System.out.println("success :)");    
  }catch(Exception e){System.out.println(e);}    
  try{    
  ObjectInputStream in=new ObjectInputStream(new FileInputStream("f1.txt"));    
  Student1 s=(Student1)in.readObject();     
  System.out.println(s.id+" "+s.name+" "+s.course+" "+s.fee);
  in.close();    
  }catch(Exception e){System.out.println(e);}    
 }    
}  