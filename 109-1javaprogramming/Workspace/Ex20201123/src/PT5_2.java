
public class PT5_2 {

	public static void main(String[] args) {
		int[][] score = new int[][] { 
			{ 76, 80, 66 },
			{ 88, 92, 35 },
			{ 90, 94, 95 },
			{ 100, 98, 78},
			{ 68, 70, 56 }
		};

		for (int i = 0; i < score.length; i++) {
			// 印出各科成績
			Arraytools.print(score[i]);
			// 印出總分
			int sum = Arraytools.sum(score[i]);
			System.out.print(sum);
			System.out.print('\t');
			// 印出平均
			double avg = Arraytools.avg(score[i]);
			System.out.print(avg);
			// 印換行
			System.out.println();
		}
	}
}