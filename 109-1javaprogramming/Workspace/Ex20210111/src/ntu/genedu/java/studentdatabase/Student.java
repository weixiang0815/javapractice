package ntu.genedu.java.studentdatabase;

import ntu.genedu.java.studentdatabase.exception.IllegalChineseScoreException;
import ntu.genedu.java.studentdatabase.exception.IllegalEnglishScoreException;
import ntu.genedu.java.studentdatabase.exception.IllegalMathScoreException;

/**
 * 學生類別
 *  
 * @author kChen
 * @version v1.0.0 可記錄國文、英文和數學成績，並且能計算總分與平均
 * @version v1.1.0 增加學生姓名
 * @version v2.0.0 增加成績超過0-100分範圍的 Exception 處理
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
	 * 分別輸入學生姓名、國文、英文及數學成績的建構子
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
	 * 輸入CSV格式的學生資料
	 * @param strCSV 一個格式為「姓名,國文,英文,數學」的字串
	 */
	Student(String strCSV) throws java.lang.IllegalArgumentException {
		String[] strField = strCSV.split(",");
		if (strField.length < 4)
			throw new java.lang.IllegalArgumentException("CSV格式錯誤，資料個數少於4個");

		this.name  = strField[0];
		
		try {
			this.chinese = Integer.parseInt(strField[1]);
		} catch (NumberFormatException e) {
			throw new NumberFormatException("國文成績錯誤:"+e.getMessage());
		}
		try {
			this.english = Integer.parseInt(strField[2]);
		} catch (NumberFormatException e) {
			throw new NumberFormatException("英文成績錯誤:"+e.getMessage());
		}
		try {
			this.math = Integer.parseInt(strField[3]);
		} catch (NumberFormatException e) {
			throw new NumberFormatException("數學成績錯誤:"+e.getMessage());
		}
		
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
	 * 取得學生資料的CSV格式
	 * @return 學生資料的CSV格式
	 */
	public String getCSV() {
		return this.getJoinString(",");
	}
	
	public String getJoinString(String sp) {
		StringBuilder str = new StringBuilder(128);
		str.append(this.name);
		str.append(sp);
		str.append(this.chinese);
		str.append(sp);
		str.append(this.english);
		str.append(sp);
		str.append(this.math);
		str.append(sp);
		str.append(this.getSum());
		str.append(sp);
		str.append(getAverage());
		return str.toString();
	}
	
	/**
	 * 改寫 toString()
	 */
	@Override
	public String toString() {
		return this.getJoinString("\t");
	}
}
