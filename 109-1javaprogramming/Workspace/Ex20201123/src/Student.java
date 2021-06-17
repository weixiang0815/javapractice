/**
 * 學生類別
 * @author henry
 *
 */
public class Student {
	// Field
	private int chinese,english,math;
	// 將資料實體化
	Student(int chinese,int english,int math){
		this.chinese=chinese;
		this.english=english;
		this.math=math;
	}
	// Method 方法
	public int sum() {
		return chinese+english+math;
	}
	public double avg() {
		return (double)sum()/3;
	}
	@Override
	public String toString() {
		String str="";
		str+=this.chinese+"\t";
		str+=this.english+"\t";
		str+=this.math+"\t";
		str+=this.sum()+"\t";
		str+=this.avg();
		return str;
	}
}
