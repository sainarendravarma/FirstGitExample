public class Exception_task03 {
	public static void main(String[] args) {
		System.out.println(main());
}
	public static int main() {
         try
         {
        	 int value = 10/10;
        	 return value;

         }
         catch(ArithmeticException e)
         {
        	return -1; 
         }
         finally
  		{
             return 7;
	}
	}
}
