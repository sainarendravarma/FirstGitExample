import java.io.*;
import java.util.*;
public class Varma_Assignment6 {
    public static void main(String[] args) {
    	System.out.println("enter the values of  and b");
        Scanner sc = new Scanner(System.in);
        try{
            int a = new Integer(sc.nextInt());
            int b = new Integer(sc.nextInt());
            System.out.println(a/b);
        }catch (InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }
        catch(Exception e) {
        	System.out.println(e);
        	
        }
        
    }
}