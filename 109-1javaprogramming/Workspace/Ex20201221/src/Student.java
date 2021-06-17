/**
 * 學生類別
 * 
 * v1.1.0 增加學生名姓 v2.0.0 增加成績超過範圍的 Exception
 * 
 * @author kChen
 * @version v1.1.0
 * @version v2.0.0
 */
public class Student {
	// Field 欄位
	/**
	 * 學生姓名
	 */
	private String name;
	/**
	 * 國文成績
	 */
	private int chinese;
	/**
	 * 英文成績
	 */
	private int english;
	/**
	 * 數學成績
	 */
	private int math;

	// 將資料實體化
	/**
	 * 建構子
	 * 
	 * @param name    學生姓名
	 * @param chinese 國文成績
	 * @param english 英文成績
	 * @param math    數學成績
	 * @throws IllegalChineseScoreException 當國文成績非 0 到 100 時所產生的例外
	 * @throws IllegalEnglishScoreException 當英文成績非 0 到 100 時所產生的例外
	 * @throws IllegalMathScoreException 當數學成績非 0 到 100 時所產生的例外
	 */
	Student(String name, int chinese, int english, int math)
			throws IllegalChineseScoreException, IllegalEnglishScoreException, IllegalMathScoreException {

		boolean isChineseError = chinese < 0 || chinese > 100;
		boolean isEnglishError = english < 0 || english > 100;
		boolean isMathError = math < 0 || math > 100;

		if (isChineseError || isEnglishError || isMathError) {
			if (isChineseError)
				throw new IllegalChineseScoreException();
			if (isEnglishError)
				throw new IllegalEnglishScoreException();
			if (isMathError)
				throw new IllegalMathScoreException();
		}

		this.name = name;
		this.chinese = chinese;
		this.english = english;
		this.math = math;
	}

	/**
	 * 取得學生姓名
	 * 
	 * @return 學生姓名
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * 取得國文成績
	 * 
	 * @return 國文成績
	 */
	public int getChinese() {
		return this.chinese;
	}

	/**
	 * 取得英文成績
	 * 
	 * @return 英文成績
	 */
	public int getEnglish() {
		return this.english;
	}

	/**
	 * 取得數學成績
	 * 
	 * @return 數學成績
	 */
	public int getMath() {
		return this.math;
	}

	/**
	 * 取得國英文的總分
	 * 
	 * @return 國英文的總分
	 */
	public int getSum() {
		return this.chinese + this.english + this.math;
	}

	/**
	 * 取得國英文的平均值
	 * 
	 * @return 國英文的平均值
	 */
	public double getAverage() {
		return this.getSum() / 3.0;
	}

	/**
	 * 改寫 toString()
	 */
	@Override
	public String toString() {
		String str = "";
		str += this.name + "\t";
		str += this.chinese + "\t";
		str += this.english + "\t";
		str += this.math + "\t";
		str += this.getSum() + "\t";
		str += this.getAverage();
		return str;
	}
}
