public class Ex12 {

	public static void main(String[] args) {

		int[][] score = { 
					{ 1, 76, 80, 60 },
					{ 2, 88, 92, 60 },
					{ 3, 90, 94, 60 },
					{ 4, 100, 98, 60 },
					{ 5, 68, 70, 60 }
				};

		System.out.println("二維陣列的內容為");
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
