import java.util.Scanner;
public class HW1_3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String n1 = in.next();
		int s11 = in.nextInt();
		int s12 = in.nextInt();
		int s13 = in.nextInt();
		int s14 = in.nextInt();
		String n2 = in.next();
		int s21 = in.nextInt();
		int s22 = in.nextInt();
		int s23 = in.nextInt();
		int s24 = in.nextInt();
		String n3 = in.next();
		int s31 = in.nextInt();
		int s32 = in.nextInt();
		int s33 = in.nextInt();
		int s34 = in.nextInt();
		in.close();
		
		float a1=(float)(s11+s12+s13+s14)/4;
		float a2=(float)(s21+s22+s23+s24)/4;
		float a3=(float)(s31+s32+s33+s34)/4;
		System.out.println(n1+" "+a1);
		System.out.println(n2+" "+a2);
		System.out.println(n3+" "+a3);
	}

}
