import java.io.*;
public class OutputStreamExample {
public static void main(String args[]) {
try(OutputStreamWriter o = new OutputStreamWriter(System.out)){
	o.write("this is surya class");
}
catch(IOException e) {
	e.printStackTrace();
}
}
}
