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
			System.out.print("�п�J���O\"add\"�B\"remove\"�B\"show\"��\"quit\":");
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
				System.out.println("�п�J���T���O");
			}
		}
		System.out.println("���±z���ϥ�");
		System.out.println("��|����!!!");
		in.close();
		inAdd.close();
		inRemove.close();
		inShow.close();
	}
	
	public static void addElement(ArrayList<String> food) {
		String keyAdd = "";
		while(true) {
			System.out.print("�п�J���W�[������:");
			keyAdd = inAdd.nextLine();
			food.add(keyAdd);
			System.out.print("�аݬO�_�~��W�[����(y/n):");
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
		System.out.println("�^��D�{��");
	}
	
	public static void removeElement(ArrayList<String> food) {
		if(food.isEmpty()==true) {
			System.out.println("�Х��W�[�����A�ϥΦ��\��");
		}
		else {
			String keyRemove = "";
			while(true) {
				System.out.print("�п�J���R��������");
				int size = food.size();
				for(int i=1;i<=size;i++) {
					if(i==size) {
						System.out.print(i);
					}
					else {
						System.out.print(i+"�B");
					}
				}
				System.out.print("�B\"all\"��\"return\":");
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
						System.out.println("�Ӥ������s�b");
					}
				}
				keyRemove = "";
			}
		}
		System.out.println("�^��D�{��");
	}
	
	
	public static void showElement(ArrayList<String> food) {
		if(food.isEmpty()==true) {
			System.out.println("�Х��[�J�����A�ϥΦ��\��");
		}
		else {
			String keyShow = "";
			while(true) {
				System.out.print("�п�J���i�檺���O\"showall\"�B\"showspecific\"��\"return\":");
				keyShow = inShow.nextLine();
				if(keyShow.equals("showall")) {
					System.out.println(food);
				}
				else if(keyShow.equals("showspecific")) {
					int size = food.size();
					System.out.print("�i��ܪ��ﶵ��");
					for(int i=1;i<=size;i++) {
						if(i==size) {
							System.out.print(i+":");
						}
						else {
							System.out.print(i+"�B");
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
					System.out.println("�п�J���T���O\"showall\"�B\"showspecific\"��\"return\":");
				}
				keyShow = "";
			}
		}
		System.out.println("�^��D�{��");
	}
	
}
