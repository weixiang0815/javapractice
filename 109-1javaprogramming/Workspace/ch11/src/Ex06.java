import java.io.*;

/**
 * 讀檔範例 (中文內容)
 * 
 * @author kChen
 *
 */
public class Ex06 {

	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader("Data.txt");

			System.out.println("每次以讀字元方式讀檔：");

			int i = 0;
			while ((i = fr.read()) != -1) {
				System.out.print((char) i);
			}
			System.out.println();

			fr.close();
		} catch (FileNotFoundException e) {
			System.out.println("檔案找不到");
		} catch (IOException e) {
			System.out.println("檔案讀取錯誤");
		}

	}

}
