import java.io.FileWriter;
import java.io.IOException;
public class FileWriterExample {
public static void main(String args[]) {
	try (FileWriter f = new FileWriter("D:\\AASLIN\\varma.txt",true)){
		f.write("this is surya class ");
		f.write(" excellent :)");
		
		System.out.println("sucess");
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}
