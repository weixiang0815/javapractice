import java.util.Scanner;
public class HW3_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String n1=in.next();
		int hp1=in.nextInt();
		String n2=in.next();
		int hp2=in.nextInt();
		int medic=in.nextInt();
		int attackn1=0,attackn2=0,round=0,flag=0;
		while(attackn1!=-1&&attackn1!=-1) {
			attackn1=in.nextInt();
			if(attackn1==-1) {
				break;
			}
			attackn2=in.nextInt();
			if(attackn2==-1) {
				break;
			}
			if(flag==0) {
				round++;
				hp1-=attackn2;
				if(hp1<=0&&medic>0) {
					while(hp1<=0&&medic>0) {
						hp1+=100;
						medic--;
						if(hp1>0||medic==0) {
							break;
						}
					}
				}
				hp2-=attackn1;
				if(hp1<=0||hp2<=0) {
					flag++;
				}
			}
		}
		in.close();
		if(hp1>hp2) {
			winner(n1,round,hp1);
		}
		else if(hp1<hp2){
			winner(n2,round,hp2);
		}
		else if(hp1==0&&hp2==0) {
			System.out.println(n1);
			System.out.println(round);
			System.out.println("1");
		}
	}
	public static void winner(String n,int round,int hp) {
		System.out.println(n);
		System.out.println(round);
		System.out.print(hp);
	}
}
