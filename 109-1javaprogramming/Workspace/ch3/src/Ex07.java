public class Ex07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int i, sum = 0; // 需要先初始化sum

		int n = 20;

		for (i = 1; i <= n; i++) { // 注意執行後，i的值
			sum = sum + i; // 重複執行的敘述
			// sum += i;
		}
		System.out.println("執行後：i = " + i + " ，sum = " + sum);
	}

}
