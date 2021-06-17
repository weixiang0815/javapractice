import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int i,j,sum=0;
		for(i=0;i<N;i++) {
			String n = in.next();
			for(j=0;j<4;j++) {
				int s = in.nextInt();
				sum+=s;
			}
			double avg=(double)(sum)/4;
			if(avg<60) {
				System.out.println("FAIL");
			}
			else {
				System.out.println("PASS");
			}
		}
		in.close();
	}

}
