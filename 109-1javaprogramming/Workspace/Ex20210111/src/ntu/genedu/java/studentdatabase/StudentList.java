package ntu.genedu.java.studentdatabase;
import java.util.ArrayList;

/**
 * 學生資料清單
 * @author kChen
 * @version v1.0
 */
public class StudentList extends ArrayList<Student> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -822485993627334104L;

	/**
	 * 新增 CSV 格式的學生資料
	 * @param strCSVList CSV 格式的學生資料
	 */
	public void add(String[] strCSVList) {
		for (String strCSV : strCSVList) {
			this.add(new Student(strCSV));
		}
	}
	
	public String[] getCSVList() {
		String[] strCSVList = new String[this.size()];
		for (int i = 0; i < this.size(); i++) {
			strCSVList[i] = this.get(i).getCSV();
		}
		return strCSVList;
	}
	
	@Override
	public String toString() {
		String str = "";
		for (int i = 0; i < this.size(); i++) {
			str += this.get(i);
			str += "\n";
		}
		return str;
	}
}
