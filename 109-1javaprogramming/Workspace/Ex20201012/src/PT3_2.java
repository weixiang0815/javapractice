import java.util.Scanner;

public class PT3_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("請輸入你的成績:");
		int score = in.nextInt();
		in.close();
		
		System.out.print("你的成績為: "+score);
		if(score>=60) {
			System.out.println("，恭喜及格");
		}
		else {
			System.out.println("，不及格，請明年再來");
		}
		System.out.println("程式結束");
	}

}
