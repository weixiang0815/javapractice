import java.util.Scanner;
public class Math_Class {

	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		System.out.print("�п�Jx��: ");
		double x = in.nextDouble();
		System.out.print("�п�Jy��: ");
		double y = in.nextDouble();
		double z = Math.sqrt((x*x)+(y*y));
		System.out.print("����z�Ȭ�"+z);
		in.close();
	}
	
}
