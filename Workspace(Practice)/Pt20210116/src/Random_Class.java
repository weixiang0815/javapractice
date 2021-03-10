import java.util.Random;
public class Random_Class {

	public static void main(String[] arg) {
		Random rd = new Random();
		int x = rd.nextInt(6)+1;
		System.out.println(x);
		double y = rd.nextDouble();
		System.out.println(y);
		boolean z = rd.nextBoolean();
		System.out.println(z);
	}
	
}
