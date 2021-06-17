import java.io.File;

/**
 * 用 java 模擬 Windows 的 dir 指令，或 Unix 的 ls 指令
 * 
 * @author kChen
 *
 */
public class Ex02 {

	public static void main(String[] args) {

		// 在 cmd 模式， ".\" 表示當前目錄
		// 在 cmd 模式， "..\" 表示上一層目錄
		File f = new File(".\\");
		File[] lists = f.listFiles(); // 列出 f 目錄內的所有檔案及目錄

		for (int i = 0; i < lists.length; i++) {
			if (lists[i].isDirectory()) {
				System.out.println("<Dir>\t" + lists[i].getName());
			} else {
				System.out.println(lists[i].getName() + "\t"
						+ lists[i].length() + "Bytes");
			}
		}
	}

}
