public class Ex02 {

	public static void main(String[] args) {
		
		int[] score = new int[3];

		score[0] = 59;
		score[1] = 95;
		score[2] = 90;

		System.out.println("三位學生的成績分別為：");
		
		for (int i = 0; i < 3; i++) {
			System.out.println("第" + (i + 1) + "位學生的成績是：" + score[i]);
		}
	}

}
