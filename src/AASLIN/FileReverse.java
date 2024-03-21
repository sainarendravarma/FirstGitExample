package AASLIN;

import java.util.ArrayList;
import java.util.Collections;
import java.io.*;

public class FileReverse {
	public static void main(String args[]) throws IOException {
		FileReader fr = new FileReader("D:\\AASLIN\\input.txt");
		FileWriter fw = new FileWriter("D:\\AASLIN\\reversed.txt");
		try {
			ArrayList<Integer> al = new ArrayList<Integer>();
			int i;
			while ((i = fr.read()) != -1) {
				al.add(i);
				// i = fr.read();
			}
			Collections.reverse(al);
			for (int num : al) {
				fw.write((char) num);
			}
			fr.close();
			fw.close();
			System.out.println("sucess");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
