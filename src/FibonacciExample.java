import java.util.*;
class FibonacciExample{  
 static int n1=0,n2=1,n3=0;    
 static void printFibonacci(int count){    
    if(count>0){    
         n3 = n1 + n2;    
         n1 = n2;    
         n2 = n3;    
         System.out.print(" "+n3);   
         printFibonacci(count-1);    
     }    
 }    
 public static void main(String args[]){ 
	 Scanner s =new Scanner(System.in);
  int count = s.nextInt();
  if(count==0) {
	  System.out.println("0");
  }
  if(count==1) {
	  System.out.println("1");
  }
  else {
	  System.out.print("0 "+"1");
  printFibonacci(count);  
 }  }
}  