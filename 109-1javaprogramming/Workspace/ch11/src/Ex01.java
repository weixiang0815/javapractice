import java.io.File;
import java.util.Date;

/**
 * 基本檔案練習
 * 
 * @author kChen
 *
 */
public class Ex01 {

	public static void main(String[] args) {

		File f = new File("Data.txt");
		System.out.println("f物件是否存在：" + f.exists());
		System.out.println("f物件是否為檔案：" + f.isFile());
		System.out.println("f物件是否可以讀取：" + f.canRead());
		System.out.println("f物件是否可以寫入：" + f.canWrite());
		System.out.println("f物件的實際名稱為：" + f.getName());
		System.out.println("f物件的修改日期為：" + new Date(f.lastModified()));
		System.out.println("f物件的實際大小為：" + f.length() + "Bytes");
		System.out.println("f物件的絕對路徑為：" + f.getAbsolutePath());
		System.out.println("f物件的路徑為：" + f.getParent());
	}

}
