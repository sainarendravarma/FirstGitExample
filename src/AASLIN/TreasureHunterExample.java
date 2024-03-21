package AASLIN;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Treasure {
	private int x;
	private int y;

	public Treasure(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

}

public class TreasureHunterExample {

	private static double calculateDistance(int currentX, int currentY, int treasureX, int treasureY) {
		return Math.sqrt(Math.pow(treasureX - currentX, 2) + Math.pow(treasureY - currentY, 2));
	}

	public static void main(String[] args) throws IOException {
		List<Treasure> treasures = new ArrayList<>();
		try (FileReader file = new FileReader("D:\\AASLIN\\mapfile.txt")) {

			Scanner scanner = new Scanner(file);

			while (scanner.hasNextLine()) {
				String[] coordinates = scanner.nextLine().split(" ");
				int x = Integer.parseInt(coordinates[0]);
				int y = Integer.parseInt(coordinates[1]);
				treasures.add(new Treasure(x, y));
			}

			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		}
		System.out.println("the treasure co-ordinates in the mapfile are :");
		for (Treasure var : treasures) {
			System.out.println(var.getX() + "      " + var.getY());
		}
		boolean flag=true;
		while(flag)
		{
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter your current X coordinate: ");
		int currentX = userInput.nextInt();
		System.out.print("Enter your current Y coordinate: ");
		int currentY = userInput.nextInt();

		double[] doublevalue = new double[treasures.size()];
		for (int i = 0; i < treasures.size(); i++) {
			Treasure treasure = treasures.get(i);
			double distance = calculateDistance(currentX, currentY, treasure.getX(), treasure.getY());
			doublevalue[i] = distance;
			System.out.println("Treasure at location (" + treasure.getX() + ", " + treasure.getY()
					+ ") is at a distance of " + distance + " units.");
		}
		
		Arrays.sort(doublevalue);
		System.out.println("the shortest distance is :");
		System.out.println(doublevalue[0]);
		System.out.print("Do you want to continue searching for more treasures? (Y/N): ");
		String answer = userInput.next();
		if(answer.equalsIgnoreCase("y"))
			flag=true;
		else
		{
			System.out.println("Exit");
			flag=false;
		}
		}
		//userInput.close();
	}

}
