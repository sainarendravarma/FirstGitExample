import java.util.ArrayList;
import java.util.List;

public class CustomArraylist {
	public static void main(String args[]) {
		ArrayList<String> customlist = new ArrayList<String>() {
			// @override
			public boolean add(String val) {
				return super.add(val + " mom");
			}
		};
		customlist.add("varma");
		System.out.println(customlist);
	}
}
//anonymous class
//important