import java.util.*;
public class pt2 {
	public static void main(String[] arg) {
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>();
		
		ArrayList<String> bakeryList = new ArrayList<String>();
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");

		ArrayList<String> produceList = new ArrayList<String>();
		produceList.add("tomatoes");
		produceList.add("zuchini");
		produceList.add("peppers");

		ArrayList<String> drinksList = new ArrayList<String>();
		drinksList.add("soda");
		drinksList.add("coffee");
		
		groceryList.add(produceList);
		groceryList.add(bakeryList);
		groceryList.add(drinksList);
		
		System.out.println(groceryList.get(0).get(0));
	}
}