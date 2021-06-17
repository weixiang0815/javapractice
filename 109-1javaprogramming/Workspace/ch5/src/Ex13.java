public class Ex13 {

	public static void main(String[] args) {

		int[][] score = {
					{ 1, 76, 80, 60 },
					{ 2, 88, 92, 60 },
					{ 3, 90, 94, 60 },
					{ 4, 100, 98, 60 },
					{ 5, 68, 70, 60 }
				};

		System.out.println("二維陣列的內容為");

		// 使用 for each 語法
		for (int[] firstArray : score) { // 取得第一維陣列的元素
			for (int element : firstArray) {
				System.out.print(element + "\t"); // 取得第二維陣列的元素
			}
			System.out.println();
		}
	}

}
