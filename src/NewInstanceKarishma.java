
public class NewInstanceKarishma {

		String name = "lavanya"; 
		int age = 19;
		int salary = 20000;
		String manager = "reshmika";
		String depart = "IT";

		public static void main(String[] args) 
		{ 
			try { 

				Class cls = Class.forName("NewInstanceKarishma"); 

				
				NewInstanceKarishma obj =(NewInstanceKarishma)cls.newInstance(); 

				System.out.println(obj.name); 
			} 

			catch (ClassNotFoundException e) 
			{ 
              e.printStackTrace(); 
			} 
			catch (InstantiationException e) { 

				e.printStackTrace(); 
			} 
 
			catch (IllegalAccessException e) { 

				e.printStackTrace(); 
			} 
		} 
	}