import java.util.ArrayList;

public class pt3 {

	public static void main(String[] arg) {
		//String[] animals = {"cat","dog","rat","bird"};
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("cat");
		animals.add("dog");
		animals.add("rat");
		animals.add("bird");
		for(String i : animals) {
			System.out.println(i);
		}
	}
	
}
