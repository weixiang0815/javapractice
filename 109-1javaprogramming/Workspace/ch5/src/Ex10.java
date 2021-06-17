public class Ex10 {

	public static void main(String[] args) {

		int[] FirstArray = new int[] { 1, 2, 3, 4, 5, 6 }; // 宣告一個int陣列，並初始化
		int[] SecondArray = new int[4]; // 宣告一個int陣列，但未初始化

		// 實際複製FirstArray的內容
		System.arraycopy(FirstArray, 2, SecondArray, 1, 2);

		System.out.println("SecondArray的 內容為：");
		for (int i = 0; i < SecondArray.length; i++) {
			System.out.println(SecondArray[i]);
		}
	}
}
