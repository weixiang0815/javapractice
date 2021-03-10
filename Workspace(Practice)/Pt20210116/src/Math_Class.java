import java.util.Scanner;
public class Math_Class {

	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		System.out.print("請輸入x值: ");
		double x = in.nextDouble();
		System.out.print("請輸入y值: ");
		double y = in.nextDouble();
		double z = Math.sqrt((x*x)+(y*y));
		System.out.print("斜邊z值為"+z);
		in.close();
	}
	
}
