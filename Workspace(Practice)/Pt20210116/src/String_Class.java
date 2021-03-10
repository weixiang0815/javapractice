
public class String_Class {

	public static void main(String[] arg) {
		
		String name = "Henry";
		boolean[] result = {
								name.equals("henry"),
								name.equalsIgnoreCase("henry"),
								name.isEmpty()
							};
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		String[] outcome = {
								name.toLowerCase(),
								name.toUpperCase()
							};
		for (int i = 0; i < outcome.length; i++) {
			System.out.println(outcome[i]);
		}
		
		String unfixed = "  Henry     ";
		String[] fixed = {
								unfixed.trim(),
								unfixed.replace('e', 'a'),
								unfixed.trim().replace('e','a')
							};
		for (int i = 0; i < fixed.length; i++) {
			System.out.println(fixed[i]);
		}
		
	}
	
}
