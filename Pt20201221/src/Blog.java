import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Blog {
	ArrayList<String> Keyword;
	char key;
	String ch;
	
	Blog(){
		Keyword = new ArrayList<String>();
		System.out.println("�w��ϥΥ�����r�x�s�t��");
		System.out.println("�п�ܭn�ϥΪ��\��");
	}
	public void input(String n) {
		System.out.print("�п�J�n�s�W������r: ");
		Keyword.add(n);
		System.out.println("������r�w�s�W");
	}
	public void output() {
		Collections.sort(Keyword);
		System.out.println("�H�U�O�w�x�s���Ҧ�����r:");
		for (String i : Keyword) {
			System.out.println(Keyword);
		}
	}
	public void remove(String n) {
		if(Keyword.contains(n) == false) {
			System.out.println("������r���s�b");
			System.out.print("�аݬO�_�s�W(y/n)? ");
			Scanner in = new Scanner(System.in);
			key = in.next().charAt(0);
			ch = in.nextLine();
			switch(key) {
			case 'y':
				Keyword.add(n);
				System.out.println("������r�w�s�W");
				break;
			case 'n':
				System.out.println("�w����x�s");
				break;
			default:
				System.out.println("�z��J�����e�����T�A�w����x�s������r");
			}
			in.close();
		}
		else {
			Keyword.remove(n);
		}
	}
	public void quit() {
		System.out.println("�P�±z�ϥΥ��t��");
		System.out.println("��|����!!");
	}
}