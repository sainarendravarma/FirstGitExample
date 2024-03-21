import java.io.IOException;
import java.io.*;
public class FileInputReader {
public static void main(String args[]) {
	try(FileReader i = new FileReader("D:\\AASLIN\\varma.txt")){
		int reader = i.read();
		while(i.ready()) {	
			reader = i.read();
			System.out.println((char)reader);
		}
		i.close();
	}
	catch(IOException e) {
		e.printStackTrace();
	}
}
}
