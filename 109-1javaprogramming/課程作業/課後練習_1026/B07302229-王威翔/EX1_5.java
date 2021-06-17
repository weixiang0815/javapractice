
public class EX1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n=0;
		int i,j;
		for(i=1;i<=20;i++) {
			double sum=1;
			for(j=1;j<=i;j++) {
				sum*=j;
			}
			n+=sum;
		}
		System.out.print(n);
	}

}
