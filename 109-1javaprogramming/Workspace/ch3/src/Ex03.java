public class Ex03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 13;

		// +(加), -(減), *(乘), /(除), %(取餘數)
		int odd = number % 2; // 如果是奇數，則odd為1，否則為0

		boolean isOdd = (odd == 1) ? true : false;

		// boolean isOdd;
		// if (odd == 1)
		// isOdd = true;
		// else
		// isOdd = false;

		if (isOdd) {
			System.out.println("數字 " + number + " 是奇數");
		} else {
			System.out.println("數字 " + number + " 是偶數");
		}

	}

}
