import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
public static void main(String args[]) {
	try(BufferedWriter br = new BufferedWriter(new FileWriter("D:\\AASLIN\\varma.txt",true))) {
		br.write(" hello surya");
		System.out.println("Sucess");
	}
	catch(IOException e) {
		e.printStackTrace();
}
}}
