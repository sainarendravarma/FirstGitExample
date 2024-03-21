
import java.io.*;   
import java.util.*;  
class CreateReadDeleteSet {   
    public static void main(String args[])   
    {   
        Set<Integer> data = new LinkedHashSet<Integer>();   
        data.add(31);   
        data.add(21);   
        data.add(41);    
        ArrayList<Integer> newData = new ArrayList<Integer>();   
        newData.add(31);   
        newData.add(71);   
        newData.add(81);  
        data.addAll(newData);   
        System.out.println("Set: " + data);  
        for (Integer value : data)   
            System.out.print(value + ", "); 
        System.out.println();
        data.remove(31);
    } 
    }   
  