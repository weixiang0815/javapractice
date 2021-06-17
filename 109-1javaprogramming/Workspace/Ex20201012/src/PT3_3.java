import java.util.Scanner;

public class PT3_3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("請輸入你的成績:");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		in.close();
		
		System.out.println("由小到大為:");
		if(a<b&&b<c) {
			System.out.println(a+"<"+b+"<"+c);
		}
		else if(a<c&&c<b) {
			System.out.println(a+"<"+c+"<"+b);
		}
		else if(b<a&&a<c) {
			System.out.println(b+"<"+a+"<"+c);
		}
		else if(b<c&&c<a) {
			System.out.println(b+"<"+c+"<"+a);
		}
		else if(c<a&&a<b) {
			System.out.println(c+"<"+a+"<"+b);
		}
		else {
			System.out.println(c+"<"+b+"<"+a);
		}
		System.out.println("程式結束");
	}

}
