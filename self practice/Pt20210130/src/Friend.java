
public class Friend {
	
	String name;
	static int numberOFfriends;
	
	Friend(String name){
		this.name=name;
		numberOFfriends++;
	}
	
	static void displayFriends() {
		System.out.println("You have "+numberOFfriends+" friends.");
	}
	
}
