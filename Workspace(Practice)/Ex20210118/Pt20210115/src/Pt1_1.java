import java.util.Scanner;
public class Pt1_1 {

	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		System.out.print("你的名字是: ");
		String name = in.nextLine();
		System.out.print("你今年幾歲: ");
		int age = in.nextInt();
		in.nextLine();
		System.out.print("你最愛的零食: ");
		String snack = in.nextLine();
		in.close();
		
		System.out.println("我叫"+name);
		System.out.println("我今年"+age+"歲");
		System.out.println("我最愛的零食是"+snack);
	}
	
}
