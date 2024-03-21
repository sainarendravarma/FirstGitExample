import java.util.*;
abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}
class Varma_Assignment1 extends Book{
void setTitle(String s) {
	super.title=s;
	System.out.println("the title is : "+super.getTitle());
}
public static void main(String args[]) {
	Varma_Assignment1 v= new Varma_Assignment1();
	Scanner s=new Scanner(System.in);
	System.out.println("enter the title");
	String title=s.nextLine();
	v.setTitle(title);
}
}
