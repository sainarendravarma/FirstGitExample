import java.util.*;
class Student2{}
class Rockstar{   }
class Hacker{}

 class Varma_Assignment4
{
   static String count(ArrayList mylist)
   {
      int a=0,b=0,c=0;
      for(int i=0;i<mylist.size();i++)
      {
         Object element=mylist.get(i);
         if(element instanceof Student2)
            a++;
         if(element instanceof Rockstar)
            b++;
         if(element instanceof Hacker)
            c++;
      }
      String ret= Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
      return ret;
   }

   public static void main(String []argh)
   {
      ArrayList mylist=new ArrayList();
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of the arraylist");
      int t=sc.nextInt();
      for(int i=0;i<t;i++)
      {
         String s=sc.next();
         if(s.equals("student"))mylist.add(new Student2());
         if(s.equals("rockstar"))mylist.add(new Rockstar());
         if(s.equals("hacker"))mylist.add(new Hacker());
      }
      System.out.println(count(mylist));
   }
}