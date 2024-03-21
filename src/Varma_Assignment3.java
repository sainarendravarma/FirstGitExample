class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}
public class Varma_Assignment3 extends Sports{
	@Override
    String getName(){
        return "Soccer Class";
    }
	@Override
	void getNumberOfTeamMembers(){
		System.out.println(super.getName());
		super.getNumberOfTeamMembers();
		System.out.println(getName());
        System.out.println( "Each team has 11 players in " + getName() );
    }
public static void main(String args[]) {
	Varma_Assignment3 v = new Varma_Assignment3();
	v.getNumberOfTeamMembers();
}
}
