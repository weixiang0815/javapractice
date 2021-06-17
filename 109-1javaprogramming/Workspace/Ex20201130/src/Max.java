import java.util.Scanner;
public class Max {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		double[] list=new double[n];
		for (int i = 0; i < list.length; i++) {
			list[i]=in.nextDouble();
		}
		in.close();
		
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list.length-1; j++) {
				if(list[j]<list[j+1]) {
					double temp=list[j];
					list[j]=list[j+1];
					list[j+1]=temp;
				}
			}
		}
		if(n>=4) {
			int Max=(int)(list[0]*list[1]*list[2]*list[3]);
			for (int i = 3; i >= 0; i--) {
				if(i==0) {
					System.out.println((int)list[i]);
				}
				else {
					System.out.print((int)list[i]+" ");
				}
			}
			System.out.print(Max);
		}
		else {
			int Max=1;
			for (int i = 0; i < list.length; i++) {
				Max*=(int)list[i];
			}
			for (int i = 0; i < list.length; i++) {
				if(i==list.length-1) {
					System.out.println((int)list[i]);
				}
				else {
					System.out.print((int)list[i]+" ");
				}
			}
			System.out.print(Max);
		}
	}

}
