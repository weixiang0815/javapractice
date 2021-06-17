public class Ex05 {
	public static void main(String[] args) {
		
		int[] score = new int[3];
		
		score[0] = 59;
		score[1] = 95;
		score[2] = 90;
		
		System.out.println("三位學生的成績分別為：");
		
		// foreach無法用來設定陣列中元素的內容
		for (int i : score) {
			i = 0;	// 無法設定到 score
			System.out.println(i);
		}
		
		for (int i : score) {
			System.out.println(i);
		}
	}

}
