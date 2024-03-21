import java.io.*;

public class FileEncryptionDecryption {
	public static String encryption(String message) {
		char[] chars = message.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] != ' ') {
				chars[i] =(char) (chars[i] + 1);
			}
		}
		return new String(chars);
	}

	public static String decryption(String encryptedMessage) {
		char[] chars = encryptedMessage.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] != ' ') {
				chars[i] = (char) (chars[i] - 1);
			}
		}
		return new String(chars);
	}

	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter a message to encrypt:");
			String message = reader.readLine();
			String encryptedMessage = encryption(message);

			BufferedWriter writer = new BufferedWriter(new FileWriter("encrypted.txt"));
			writer.write(encryptedMessage);
			writer.close();
			System.out.println("Message encrypted and saved to encrypted.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			BufferedReader fileReader = new BufferedReader(new FileReader("encrypted.txt"));
			String encryptedMessage = fileReader.readLine();
			String decryptedMessage = decryption(encryptedMessage);
			System.out.println("Decrypted message: " + decryptedMessage);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}