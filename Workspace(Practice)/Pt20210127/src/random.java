import java.util.Random;
public class random {

	public static void main(String[] args) {
		Random rd = new Random();
		String[] name = new String[3];
		for (int i = 0; i < name.length; i++) {
			int n = rd.nextInt(5)+1;
			switch(n) {
				case 1:
					name[i] = "�i�a��";
					break;
				case 2:
					name[i] = "�Q���W";
					break;
				case 3:
					name[i] = "�}�ʽn";
					break;
				case 4:
					name[i] = "���µ�";
					break;
				case 5:
					name[i] = "��ˡ��";
					break;
				case 6:
					name[i] = "���\��";
					break;
			}
		}
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
	}

}
