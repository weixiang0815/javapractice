import java.io.*;

/**
 * 檔案更名
 * 
 * @author kChen
 *
 */
public class Ex03 {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("請輸入原始的檔名及欲更改的檔名：");
			System.exit(1);
		}

		File fs = new File(args[0]);
		File fd = new File(args[1]);
		if (fs.exists()) {
			if (!fd.exists()) {
				if (fs.renameTo(fd)) {
					System.out.println(fs.getName() + " 已改名為 " + fd.getName());
					System.out.println("1 file(s) has been renamed!");
				}
			}
		}
	}
}
