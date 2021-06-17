import java.util.ArrayList;
import java.util.Scanner;

public class Pt1 {

	private static Scanner in;
	private static Scanner inAdd;
	private static Scanner inRemove;
	private static Scanner inShow;
	
	public static void main(String[] arg) {
		in = new Scanner(System.in);
		inAdd = new Scanner(System.in);
		inRemove = new Scanner(System.in);
		inShow = new Scanner(System.in);
		ArrayList<String> food = new ArrayList<String>();
		while(true) {
			System.out.print("請輸入指令\"add\"、\"remove\"、\"show\"或\"quit\":");
			String key = "";
			key = in.nextLine();
			if(key.equals("add")) {
				addElement(food);
			}
			else if(key.equals("remove")) {
				removeElement(food);
			}
			else if(key.equals("show")) {
				showElement(food);
			}
			else if(key.equals("quit")) {
				break;
			}
			else {
				System.out.println("請輸入正確指令");
			}
		}
		System.out.println("謝謝您的使用");
		System.out.println("後會有期!!!");
		in.close();
		inAdd.close();
		inRemove.close();
		inShow.close();
	}
	
	public static void addElement(ArrayList<String> food) {
		String keyAdd = "";
		while(true) {
			System.out.print("請輸入欲增加的項目:");
			keyAdd = inAdd.nextLine();
			food.add(keyAdd);
			System.out.print("請問是否繼續增加項目(y/n):");
			keyAdd = "";
			keyAdd = inAdd.nextLine();
			if(keyAdd.equals("y")||keyAdd.equals("Y")) {
				keyAdd = "";
				continue;
			}
			else if(keyAdd.equals("n")||keyAdd.equals("N")) {
				break;
			}
		}
		System.out.println("回到主程式");
	}
	
	public static void removeElement(ArrayList<String> food) {
		if(food.isEmpty()==true) {
			System.out.println("請先增加元素再使用此功能");
		}
		else {
			String keyRemove = "";
			while(true) {
				System.out.print("請輸入欲刪除的元素");
				int size = food.size();
				for(int i=1;i<=size;i++) {
					if(i==size) {
						System.out.print(i);
					}
					else {
						System.out.print(i+"、");
					}
				}
				System.out.print("、\"all\"或\"return\":");
				keyRemove = inRemove.nextLine();
				if(keyRemove.equals("all")) {
					food.clear();
					break;
				}
				else if(keyRemove.equals("return")) {
					break;
				}
				else {
					int index = Integer.parseInt(keyRemove);
					if(index>=1 && index<=size) {
						food.remove(index-1);
					}
					else {
						System.out.println("該元素不存在");
					}
				}
				keyRemove = "";
			}
		}
		System.out.println("回到主程式");
	}
	
	
	public static void showElement(ArrayList<String> food) {
		if(food.isEmpty()==true) {
			System.out.println("請先加入元素再使用此功能");
		}
		else {
			String keyShow = "";
			while(true) {
				System.out.print("請輸入欲進行的指令\"showall\"、\"showspecific\"或\"return\":");
				keyShow = inShow.nextLine();
				if(keyShow.equals("showall")) {
					System.out.println(food);
				}
				else if(keyShow.equals("showspecific")) {
					int size = food.size();
					System.out.print("可顯示的選項有");
					for(int i=1;i<=size;i++) {
						if(i==size) {
							System.out.print(i+":");
						}
						else {
							System.out.print(i+"、");
						}
					}
					int pos = inShow.nextInt();
					inShow.nextLine();
					System.out.println(food.get(pos-1));
				}
				else if(keyShow.equals("return")) {
					break;
				}
				else {
					System.out.println("請輸入正確指令\"showall\"、\"showspecific\"或\"return\":");
				}
				keyShow = "";
			}
		}
		System.out.println("回到主程式");
	}
	
}
