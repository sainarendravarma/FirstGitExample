import java.io.*;

public class FileConcatination {
	public void file1Method() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("D:\\AASLIN\\file1.txt");
		FileWriter fw = new FileWriter("D:\\AASLIN\\concatinated.txt", true);
		try {
			int i = fr.read();
			while (fr.ready()) {
				fw.write(i);
				i = fr.read();
			}
			fr.close();
			fw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void file2Method() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("D:\\AASLIN\\file2.txt");
		FileWriter fw = new FileWriter("D:\\AASLIN\\concatinated.txt", true);
		try {
			int i = fr.read();
			while (fr.ready()) {
				fw.write(i);
				i = fr.read();
			}
			fr.close();
			fw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String args[]) throws FileNotFoundException, IOException {
		FileConcatination fc = new FileConcatination();
		fc.file1Method();
		fc.file2Method();
		System.out.println("sucess");

	}
}
