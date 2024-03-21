class NewInstance1{  
	 void message(){System.out.println("Hello Java");}  
	}  
	  
	class Test{  
	 public static void main(String args[]){  
	  try{  
	  Class c=Class.forName("NewInstance1");  
	  NewInstance1 s=(NewInstance1)c.newInstance();  
	  s.message();  
	  
	  }catch(Exception e){System.out.println(e);}  
	  
	 }  
	} 