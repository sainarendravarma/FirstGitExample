package AASLIN;
import java.io.*;
public class TreasureExample {
	public static void main(String args[]) {
		try(FileReader fr = new FileReader("D:\\AASLIN\\mapfile.txt")){
			//System.out.println("sucess");

//	        treasures.sort((t1, t2) -> {
//	            double dist1 = calculateDistance(currentX, currentY, t1.getX(), t1.getY());
//	            double dist2 = calculateDistance(currentX, currentY, t2.getX(), t2.getY());
//	            return Double.compare(dist1, dist2);
//	        });
	//System.out.println(treasures.size());
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
