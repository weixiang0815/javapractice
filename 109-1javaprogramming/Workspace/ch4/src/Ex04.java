import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		
		Scanner in = new Scanner(System.in);
		System.out.println("請輸入半徑：");
		double r = in.nextDouble();
		in.close();
	
		double area = CArea(r);
		System.out.println("圓的面積為：" + area);

	}

	public static double CArea(double r) {
		double ret;

		// 求圓面積=半徑*半徑*3.14
		ret = r * r * 3.14;

		return ret;
	}

}
