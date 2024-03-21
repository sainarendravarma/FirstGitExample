package AASLIN;

import java.io.*;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaFrequencyExample1 {

	public static void main(String[] args) throws IOException {
		Map<String, Integer> frequencyMap = new HashMap<>();

		try (Scanner scanner = new Scanner(new File("D:\\AASLIN\\input1.txt"))) {
			while (scanner.hasNext()) {
				String word = scanner.next().toLowerCase().replaceAll("[^a-zA-Z ]", "");
				frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + e.getMessage());
			return;
		}

		try (FileWriter writer = new FileWriter("D:\\AASLIN\\word_frequencies.txt")) {
			frequencyMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
					.forEach(entry -> {
						try {
							writer.write((entry.getKey() + ": " + entry.getValue()) + " \n");
						} catch (IOException e) {
							e.printStackTrace();
						}
					});
		} catch (FileNotFoundException e) {
			System.out.println("Error writing to file: " + e.getMessage());
		}
	}
}