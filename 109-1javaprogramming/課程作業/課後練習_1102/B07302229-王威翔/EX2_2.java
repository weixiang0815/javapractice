import java.util.Scanner;
public class EX2_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		in.close();
		System.out.print( GCD(x,y) );
	}
	public static int GCD( int x , int y ) {
		int z=0,u = 1;
		while(u<=x && u<=y) {
			if(x%u == 0 && y%u == 0) {
				z=u;
			}
			u++;
		}
		return z;
	}
}