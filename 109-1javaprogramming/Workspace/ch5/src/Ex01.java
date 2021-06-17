public class Ex01 {

	public static void main(String[] args) {

		// 陣列宣告與初始值一起
		int[] score = new int[3];
		
		// 陣列宣告 與 配置記憶體 分開
//		int[] score;  // 陣列宣告
//		score = new int[3]; // 配置記憶體 

		// 把數值寫到陣列
		score[0] = 59;
		score[1] = 95;
		score[2] = 90;
		
		System.out.println("三位學生的成績分別為：");
		
		// 從陣列讀取數值
		System.out.println("第1位學生的成績是：" + score[0]);
		System.out.println("第2位學生的成績是：" + score[1]);
		System.out.println("第3位學生的成績是：" + score[2]);
	}

}
