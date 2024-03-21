import java.io.*;
public class BufferedReaderExample {
public static void main(String args[]){
	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
		System.out.println(br.readLine());
		while(br.ready()) {
			//System.out.println(br.readLine());
		}
	}
	catch(IOException e) {
		e.printStackTrace();
	}
}

public String readLine() {
	// TODO Auto-generated method stub
	return null;
}
}
