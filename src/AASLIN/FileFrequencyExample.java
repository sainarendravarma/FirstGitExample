package AASLIN;
				
import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
				
public class FileFrequencyExample {
	public static void main(String args[]) throws FileNotFoundException {
		try (FileReader fr = new FileReader("D:\\AASLIN\\input1.txt")) {
			ArrayList<Integer> al = new ArrayList<Integer>();
			BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\AASLIN\\word_frequencies.txt"));
			Map<String, Integer> mp = new HashMap<String, Integer>();
			int i;
			StringBuffer s = new StringBuffer();
			while ((i = fr.read()) != -1) {
				al.add(i);
			}	
			for (int var : al) {
				s.append((char) var);
			}	
			String str = s.toString();
			String array[] = str.split(" ");
			for (String word : array) {
				word = word.toLowerCase();
				if (!word.isEmpty()) {
					mp.put(word, mp.getOrDefault(word, 0) + 1);
				}
			}	
			List<Map.Entry<String, Integer>> al1 = new ArrayList<>(mp.entrySet());
			al1.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
			for (Map.Entry<String, Integer> e : al1) {
				bw.write(e.getKey() + " " + e.getValue() + " \n");
				bw.newLine();
			}	
			System.out.println("sucess");
			fr.close();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}			
}
