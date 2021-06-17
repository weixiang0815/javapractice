
public class IllegalChineseScoreException extends IllegalScoreException {

	public IllegalChineseScoreException(String message) {
		super(message);
	}

	public IllegalChineseScoreException() {
		super("非法的國文成績");
	}
}
