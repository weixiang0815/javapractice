import java.util.ArrayList;

/**
 * 學生資料清單
 * @author kChen
 * @version v1.0
 */
public class StudentList extends ArrayList<Student> {

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
