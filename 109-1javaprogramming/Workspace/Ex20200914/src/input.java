import java.util.Scanner;

public class input {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("請輸入姓名");
		String str = in.nextLine();
		in.close();

		System.out.println(str);

	}

}
