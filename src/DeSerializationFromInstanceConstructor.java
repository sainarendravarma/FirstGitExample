
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;  
class DeSerializationFromInstanceConstructor implements Serializable{  
 public static void main(String args[]){  
  try{    
  ObjectInputStream in=new ObjectInputStream(new FileInputStream("f3.txt"));  
  SerializationFromInstanceConstructor s1=(SerializationFromInstanceConstructor)in.readObject();
  ObjectInputStream in1=new ObjectInputStream(new FileInputStream("f4.txt"));  
  SerializationFromInstanceConstructor s2=(SerializationFromInstanceConstructor)in1.readObject();
  System.out.println(s1.name+" "+s1.salary+" "+s1.manager+" "+s1.department);
  System.out.println(s2.name+" "+s2.salary);
  in.close();  
  in1.close();
  }catch(Exception e){e.printStackTrace();} 
  finally {
	  System.out.println("DeSerialization completed :)");
  }
 }  
}  