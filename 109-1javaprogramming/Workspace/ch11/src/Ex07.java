import java.io.*;

/**
 * 寫檔範例 (中文內容)
 * @author kChen
 *
 */
public class Ex07 {

	public static void main (String[] args) throws IOException {
		File f = new File("File2.txt");

		FileWriter fw = new FileWriter(f);
		
		String str = "JAVA真容易學.\n";
		
		fw.write(str);
		fw.close();
	}

}
