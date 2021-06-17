package genedu.java.studentdatabase;
/**
 * 非法成績例外
 * @author kChen
 *
 */
public class IllegalScoreException extends IllegalArgumentException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5607071690527722317L;

	public IllegalScoreException(String message) {
		super(message);
	}
	
}
