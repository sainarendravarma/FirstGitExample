import java.util.*;
public class CommonSets
{
	public static void main(String[] args)
	{
		HashSet<String> set1 = new HashSet<String>();
		set1.add("varma");
		set1.add("dharma");
		set1.add("sasi");
		set1.add("dinesh");
		System.out.println("Frist HashSet : "+set1);
		HashSet<String> set2 = new HashSet<String>();
		set2.add("dharma");
		set2.add("lavanya");
		set2.add("daddy");
		set2.add("mom");
		System.out.println("Second HashSet : "+set2);
		set1.retainAll(set2);
		System.out.println("HashSet content : "+set1);
	}
}