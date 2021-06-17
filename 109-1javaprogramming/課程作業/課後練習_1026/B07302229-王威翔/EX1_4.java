import java.util.Scanner;
public class EX1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		
		int i;
		for(i=1;i<n;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
			}
		}
	}

}
