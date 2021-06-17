package ntu.genedu.java.studentdatabase;

import java.io.*;

/**
 * 專門處理檔案讀寫的類別
 * 
 * @author kChen
 *
 */
public class FileHelper {

	private File file;

	/**
	 * 檔案讀寫類別的建構子
	 * 
	 * @param strFile 檔案名稱或完整的檔案路徑包含檔名
	 */
	FileHelper(String strFile) {
		this.file = new File(strFile);
	}

	/**
	 * 將檔案內容讀取出來
	 * 
	 * @return String值，其為檔案內容
	 * @throws FileNotFoundException
	 * @throws java.io.IOException
	 */
	public String readFile() throws FileNotFoundException, java.io.IOException {
		FileReader fr = new FileReader(this.file);
		// 讓 stream 有 readLine()
		BufferedReader br = new BufferedReader(fr);

		// 加快字串合併 
		StringBuilder strFile = new StringBuilder(1024);
		String str;
		while ((str = br.readLine()) != null) {
			strFile.append(str);
			strFile.append("\n");
		}

		br.close();
		fr.close();
		return strFile.toString();
	}
	
	/**
	 * 將 str 寫入至檔案
	 * @param str 欲寫入檔案的內容
	 * @throws IOException
	 */
	public void writeFile(String str) throws IOException {
		FileWriter fw = new FileWriter(this.file);
		fw.write(str);
		fw.close();
	}
}
