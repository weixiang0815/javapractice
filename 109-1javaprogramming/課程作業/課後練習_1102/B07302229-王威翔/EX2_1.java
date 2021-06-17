import java.util.Scanner;
public class EX2_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		in.close();
		timeduring(x);
	}
	public static void timeduring(int x) {
		long start_time = System.currentTimeMillis();
		System.out.println(recursive(x));
		long end_time = System.currentTimeMillis();
		System.out.println(end_time-start_time);
		
		long start_time2 = System.currentTimeMillis();
		System.out.println(nonrecursive(x));
		long end_time2 = System.currentTimeMillis();
		System.out.println(end_time2-start_time2);
	}
	public static int recursive(int x){
		if(x==1) {
			return 1;
		}
		else if(x==2) {
			return 1;
		}
		else {
			return recursive(x-1)+recursive(x-2);
		}
	}
	public static int nonrecursive(int x) {
		int a[];
		a=new int[x+1];
		a[0]=0;
		a[1]=1;
		int i;
		for(i=2;i<x+1;i++) {
			a[i]=a[i-1]+a[i-2];
		}
		return a[x];
	}
}