import java.util.Scanner;
import java.util.ArrayList;

public class PT1 {

	public static void main(String[] args) {
		ArrayList<String> Blog = new ArrayList<String>();
		Scanner in = new Scanner(System.in);
		char key;
		String keyword,ch;
		
		ok:
		while(true) {
			System.out.print("請輸入 \'i\', \'o\', \'r\'或\'q\': ");
			key = in.next().charAt(0);
			ch = in.nextLine();
			switch(key) {
			case'q':
				in.close();
				System.out.print("謝謝光臨 :)");
				break ok;
			case'i':
				System.out.print("請輸入要加入的新關鍵字: ");
				keyword = in.nextLine();
				Blog.add(keyword);
				System.out.println("已加入新關鍵字");
				break;
			case'r':
				System.out.print("請輸入要刪除的關鍵字: ");
				keyword = in.nextLine();
				if(Blog.contains(keyword) == false) {
					System.out.println("沒有 \""+keyword+"\" 這個關鍵字");
					while(true) {
						System.out.print("是否儲存此關鍵字(y/n)? ");
						key = in.next().charAt(0);
						ch = in.nextLine();
						if(key == 'y') {
							Blog.add(keyword);
							System.out.println("已加入新關鍵字");
							break;
						}
						else if(key == 'n') {
							break;
						}
						else {
							System.out.println("阿哩嗎豪啦別鬧了行不?!");
							continue;
						}
					}
				}
				else {
					Blog.remove(keyword);
					System.out.println("已刪除該關鍵字");
				}
				break;
			case'o':
				System.out.println(Blog);
				System.out.println("以上為目前所有的關鍵字");
				break;
			default:
				System.out.println("請輸入正確的字元");
				break;
			}
		}

	}

}
