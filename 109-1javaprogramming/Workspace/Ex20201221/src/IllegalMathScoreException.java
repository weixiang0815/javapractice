
public class IllegalMathScoreException extends IllegalScoreException {

	public IllegalMathScoreException(String message) {
		super(message);
	}

	public IllegalMathScoreException() {
		super("非法的數學成績");
	}
}
