import java.util.Scanner;
public class PT4_1 {
	//使用者
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("求a和b的最大值");
		System.out.print("請輸入兩個正整數a和b :");
		int a = in.nextInt();
		int b = in.nextInt();
		in.close();
		//使用開發者開發的MyMath
		int m2=MyMath.max2(a, b);
		System.out.print("最大值為:"+m2);
	}
}
