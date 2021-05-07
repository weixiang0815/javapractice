package ntu.genedu.java.studentdatabase.exception;
/**
 * 非法的國文成績例外
 * @author kChen
 *
 */
public class IllegalChineseScoreException extends IllegalScoreException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5011916582545090774L;

	public IllegalChineseScoreException(String message) {
		super(message);
	}

	public IllegalChineseScoreException() {
		super("非法的國文成績");
	}
}
