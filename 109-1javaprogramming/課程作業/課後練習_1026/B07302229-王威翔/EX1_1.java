import java.util.Scanner;
public class EX1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.close();
		int i;
		for(i=1;i<=N;i++) {
			if(i%2==0) {
				System.out.print(i + " ");
			}
		}
	}

}
