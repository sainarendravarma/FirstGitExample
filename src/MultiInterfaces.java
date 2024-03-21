interface varma{
	void finish();
}
interface dharma{
	void finish();
}
public class MultiInterfaces implements varma, dharma{
   public void finish(){
	System.out.println("method body");
}
    public static void main(String args[]) {
    	dharma m =new MultiInterfaces();
    	m.finish();
    	varma n =new MultiInterfaces();
    	n.finish();
    }
}
