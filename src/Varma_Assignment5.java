import java.util.*;
public class Varma_Assignment5{
	void MethodCall(ArrayList mylist) {
		Iterator it = mylist.iterator();
		int i=mylist.size();
        while(it.hasNext()){
            Object element = it.next();
            if(element!="###") {
            	continue;
            }else{
            	if(it.hasNext()){
            	int j=mylist.indexOf("###");
            	int k=j;
            	for(;(k<i-1);k++) {
            		
            		System.out.println(it.next());
            	}}}}}
    public static void main(String []args){
    	Varma_Assignment5 v5=new Varma_Assignment5();
        ArrayList mylist = new ArrayList();
        mylist.add(1);
        mylist.add(2);
        mylist.add("###");
        mylist.add("hello");
        mylist.add("varma");
        v5.MethodCall(mylist);
    }
}