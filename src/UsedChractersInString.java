import java.util.Scanner; 
public class UsedChractersInString
{    
	public static void main(String[] args)
	{    
		String text;
		int count=0;
		char ch;       
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the String : ");
		text = input.nextLine();
		text=text.toUpperCase();
		for ( ch = 'A'; ch <= 'Z'; ch++ )
		{
			for(int i=0;i<text.length();i++) {
				if(ch==text.charAt(i)) {
					System.out.println(ch);
					count++;
					break;
				}
			}
		}
		System.out.println("the number of characters present is "+count);
	}
}