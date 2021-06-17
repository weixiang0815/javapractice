import java.io.*;

/**
 * 寫檔範例
 * 
 * @author kChen
 *
 */
public class Ex05 {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("file.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		byte[] c = { 'J', 'a', 'v', 'a', '4' };
		dos.write(c);
		fos.close();
		dos.close();

	}
}
