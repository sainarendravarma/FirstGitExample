import java.io.*;
import java.util.ArrayList;
import java.util.List;
class CreatingReadUpdateDeleteList {
    public static void main (String[] args) {
        List<String> newList = new ArrayList<>();
        newList.add("Hello");
        newList.add("World");
        newList.add("i");
        newList.add("am");
        newList.add("varma");
        newList.add("uppalapati");
       newList.set(2, "WE");
       newList.remove(1);
        for (String x : newList) {
        	System.out.println(x);
        }
    }
}