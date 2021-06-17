import java.util.Scanner;

public class HW1_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		in.close();
		
		int b = (a%10)*100+(a/10%10)*10+(a/100);
		System.out.println(b);
		
	}

}
