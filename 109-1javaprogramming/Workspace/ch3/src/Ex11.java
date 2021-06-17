public class Ex11 {


	public static void main(String[] args) {

		int i = 11, sum = 0;

		do {
			sum = sum + i;
			i++; // 迴圈控制變數值的增加
		} while (i <= 10); // 若 i 的初始值改成 11 會如何?

		System.out.println("執行後：i = " + i + " ，sum = " + sum);

	}

}
