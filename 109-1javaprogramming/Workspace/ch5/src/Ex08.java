public class Ex08 {
	public static void main(String[] args) {
		
		// 宣告一個int陣列，並初始化
		int[] A1 = { 1, 2, 3, 4 }; 
		// 完整寫法
		//int[] A1 = new int[] {1, 2, 3, 4};
		//  分開寫法
//		int[] A1;
//		A1 = new int[]{1, 2, 3, 4};
		
		// 宣告一個int陣列，但未初始化
		int[] A2; 

		A2 = A1;
		
		System.out.print("最開始A1的內容為：");
		PrintArray(A1);
		System.out.print("最開始A2的內容為：");
		PrintArray(A2);
		
		A1[2] = 100; // 重新指定A1第3個元系的值為100
		
		System.out.print("改變後A1的內容為：");
		PrintArray(A1);
		System.out.print("改變後A2的內容為：");
		PrintArray(A2);
	}

	/**
	 * 專門印陣列
	 * @param ArrayName
	 */
	public static void PrintArray(int[] ArrayName) {
		for (int i = 0; i < ArrayName.length; i++) {
			System.out.print(" " + ArrayName[i] + " ");
		}
		System.out.println();
	}

}
