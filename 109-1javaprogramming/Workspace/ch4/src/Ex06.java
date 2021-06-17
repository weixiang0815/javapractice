public class Ex06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// 記錄程式執行開始的時間
		long start = System.currentTimeMillis();

		System.out.println("Sum:" + Sum(10));
		
		// 記錄程式執行結束的時間
		long end = System.currentTimeMillis();
		
		System.out.println("執行花 " + (end - start) +" 豪秒");
	}

	public static int Sum(int n) {

		// 當 n 為 1 時，直接回傳 1
		if (n == 1)
			return 1;

		return n + Sum(n - 1);
	}
}
