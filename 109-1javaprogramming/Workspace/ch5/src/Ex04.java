public class Ex04 {
	public static void main(String[] args) {
		
		int[] score = new int[3];
		
		score[0] = 59;
		score[1] = 95;
		score[2] = 90;
		
		System.out.println("三位學生的成績分別為：");

		// JDK 1.5 之後可使用 foreach，只能讀取，無法寫入
		for (int i : score) {
			System.out.println(i);
		}
	}
}
