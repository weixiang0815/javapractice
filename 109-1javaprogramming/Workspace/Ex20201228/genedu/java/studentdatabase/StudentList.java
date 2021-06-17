package genedu.java.studentdatabase;
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
