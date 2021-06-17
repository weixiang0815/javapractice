package exception;

public class IllegalFee extends IllegalArgumentException {

	/**
	 * 非法手續費例外
	 */
	private static final long serialVersionUID = 8848029375238783697L;

	public IllegalFee(String message) {
		super(message);
	}
	
	public IllegalFee() {
		super("非法的手續費");
	}
}
