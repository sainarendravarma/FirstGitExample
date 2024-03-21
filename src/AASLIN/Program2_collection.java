package AASLIN;
import java.util.*;
public class Program2_collection {
public static void main(String[] args) {
List<String> list_Strings = new ArrayList<String>();
list_Strings.add("Red");
list_Strings.add("Green");
list_Strings.add("Orange");
list_Strings.add("White");
list_Strings.add("Black");
System.out.println(list_Strings);
list_Strings.add(0, "Pink");
System.out.println(list_Strings);
list_Strings.remove(4);
String element = list_Strings.get(2);
System.out.println("element at index 2 is : ");
}
}