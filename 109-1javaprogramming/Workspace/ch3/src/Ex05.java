public class Ex05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int i = 0, j = 0;

		switch (i) {
		case 0:
			j += 0;
		case 2:
			j += 2;
		case 4:
			j += 4;
		default:
			j += 6;
		}
		System.out.println("程式執行後，j = " + j);
	}

}
