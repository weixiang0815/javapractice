import java.util.Scanner;

public class HW1_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();
		int e = in.nextInt();
		in.close();
		
		int f = a+b+(c+5)+d+(e+5);
		System.out.println(f);
		
	}

}
