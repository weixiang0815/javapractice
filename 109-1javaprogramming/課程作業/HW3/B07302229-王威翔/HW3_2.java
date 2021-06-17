import java.util.Scanner;
public class HW3_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		in.close();
		int c = lcm(a,b);
		System.out.print(c);
	}
	public static int lcm(int x,int y) {
		int z=x*y/hcf(x,y);
		return z;
	}
	public static int hcf(int x,int y) {
		int z=0,u=1;
		while(u<=x&&u<=y) {
			if(x%u==0&&y%u==0) {
				z=u;
			}
			u++;
		}
		return z;
	}
}
