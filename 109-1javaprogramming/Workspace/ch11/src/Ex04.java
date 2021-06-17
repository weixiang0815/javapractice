import java.io.*;

/**
 * 讀檔範例
 * 
 * @author kChen
 *
 */
public class Ex04 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("Data.txt");
		DataInputStream dis = new DataInputStream(fis);
		int i;
		int fileSize = dis.available(); // 回傳檔案大小
		System.out.println("檔案大小為：" + fileSize);

		while ((i = dis.read()) != -1) {
			System.out.print((char) i);
		}
		fis.close();
		dis.close();
	}

}
