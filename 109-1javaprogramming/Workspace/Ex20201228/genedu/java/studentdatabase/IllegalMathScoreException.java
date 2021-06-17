package genedu.java.studentdatabase;

/**
 * 非法的數學成績例外
 * @author kChen
 *
 */
public class IllegalMathScoreException extends IllegalScoreException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 246055057786822510L;

	public IllegalMathScoreException(String message) {
		super(message);
	}

	public IllegalMathScoreException() {
		super("非法的數學成績");
	}
}
