
public class Ex14 {

	public static void main(String[] args) {

		int i = 1, j = 5;

		do {
			if (i < j) {
				j--;
				System.out.println("程式執行時，i = " + i + " ，j = " + j);
				continue;
			}
			i++;
		} while (i < 5);

		System.out.println("程式執行後，i = " + i + " ，j = " + j);
	}

}
