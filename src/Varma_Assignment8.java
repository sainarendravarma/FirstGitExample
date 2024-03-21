
import java.util.*;

class Flower {
    String whatsYourName() {
        return "name rose";
    }
}


class Jasmine extends Flower {
    String whatsYourName() {
        return "Jasmine";
    }
}

class Lily extends Flower {
    String whatsYourName() {
        return "Lily";
    }
}

class Lotus extends Flower {
    String whatsYourName() {
        return "Lotus";
    }
}
class State {
    Flower yourNationalFlower() {
        return new Flower();
    }
}

class WestBengal extends State {
    @Override
    Jasmine yourNationalFlower() {
        return new Jasmine();
    }
}

class Karnataka extends State {
    @Override
    Lotus yourNationalFlower() {
        return new Lotus();
    }
}

class AndhraPradesh extends State {
    @Override
    Lily yourNationalFlower() {
        return new Lily();
    }
}

public class Varma_Assignment8{

public static void main(String[] args)
{
	Scanner s = new Scanner(System.in);
	
	System.out.println("enter state you need");
	
	String s1 = s.next();
	
	WestBengal wb = new WestBengal();
	AndhraPradesh ap= new AndhraPradesh();
	Karnataka kk = new Karnataka();
	if(s1.equals("WestBengal"))
	{
		Jasmine ja = wb. yourNationalFlower();
		
		System.out.println(ja.whatsYourName());
	}
	
	if(s1.equals("AndhraPradesh"))
	{
		Lily li = ap. yourNationalFlower();
		
		System.out.println(li.whatsYourName());
	}
	if(s1.equals("Karnataka"))
	{
		Lotus lo = kk. yourNationalFlower();
		
		System.out.println(lo.whatsYourName());
	}
		
}

}