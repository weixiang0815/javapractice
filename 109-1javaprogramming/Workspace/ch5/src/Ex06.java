public class Ex06 {
	public static void main(String[] args) {

		// 一維陣列的初始化
		int[] score = new int[] { 59, 95, 90 };

		// 簡化寫法
		int[] score2 = { 85, 95, 90 };
		// 實際執行時，編譯器會補上 new int[]
//		int[] score2 = new int[] { 85, 95, 90 };

		int[] score3;
		// 隔100行
//		score3 = { 85, 95, 90 }; // 宣告與配置分開時，不能使用簡化寫法
		score3 = new int[] { 85, 95, 90 }; //宣告與配置分開時, 必需採用標準寫法 new int[]
		
		System.out.println("三位學生的成績分別為：");

		for (int i = 0; i < score.length; i++)
			System.out.println("第" + (i + 1) + "位學生的成績是：" + score[i]);
	}
}
