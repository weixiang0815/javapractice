import java.util.Scanner;
public class Pt1_1 {

	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		System.out.print("�A���W�r�O: ");
		String name = in.nextLine();
		System.out.print("�A���~�X��: ");
		int age = in.nextInt();
		in.nextLine();
		System.out.print("�A�̷R���s��: ");
		String snack = in.nextLine();
		in.close();
		
		System.out.println("�ڥs"+name);
		System.out.println("�ڤ��~"+age+"��");
		System.out.println("�ڳ̷R���s���O"+snack);
	}
	
}
