import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class PT11 {

	public static void main(String[] args) {
		try {
			System.out.println("=================");
			System.out.println("每次以讀一行的方式讀檔 (借用 BufferedReader)");
			FileReader fr = new FileReader("Data.txt");
			BufferedReader br = new BufferedReader(fr);

			String str = "";
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
			System.out.println("=================");
			
			br.close();
			fr.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("檔案找不到");
		} catch (IOException e) {
			System.out.println("檔案讀取錯誤");
		}

	}

}
