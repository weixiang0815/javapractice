import java.util.Scanner;

public class HW0 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("請輸入姓名 學號 系所");
		String str = in.nextLine();
		in.close();

		System.out.println(str);

	}

}
