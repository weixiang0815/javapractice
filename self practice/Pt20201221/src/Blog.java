import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Blog {
	ArrayList<String> Keyword;
	char key;
	String ch;
	
	Blog(){
		Keyword = new ArrayList<String>();
		System.out.println("歡迎使用本關鍵字儲存系統");
		System.out.println("請選擇要使用的功能");
	}
	public void input(String n) {
		System.out.print("請輸入要新增的關鍵字: ");
		Keyword.add(n);
		System.out.println("該關鍵字已新增");
	}
	public void output() {
		Collections.sort(Keyword);
		System.out.println("以下是已儲存的所有關鍵字:");
		for (String i : Keyword) {
			System.out.println(Keyword);
		}
	}
	public void remove(String n) {
		if(Keyword.contains(n) == false) {
			System.out.println("該關鍵字不存在");
			System.out.print("請問是否新增(y/n)? ");
			Scanner in = new Scanner(System.in);
			key = in.next().charAt(0);
			ch = in.nextLine();
			switch(key) {
			case 'y':
				Keyword.add(n);
				System.out.println("該關鍵字已新增");
				break;
			case 'n':
				System.out.println("已放棄儲存");
				break;
			default:
				System.out.println("您輸入的內容不正確，已放棄儲存該關鍵字");
			}
			in.close();
		}
		else {
			Keyword.remove(n);
		}
	}
	public void quit() {
		System.out.println("感謝您使用本系統");
		System.out.println("後會有期!!");
	}
}