import java.io.*;
public class FileExample {
public static void main(String args[]) {
	InputStreamReader i = new InputStreamReader(System.in);
	try{
		int letter = i.read();
		while(i.ready()) {
			System.out.println((char)letter);
			letter=i.read();
		}
		i.close();
	}
	catch(IOException e) {
		e.printStackTrace();
		
	}
}
}
