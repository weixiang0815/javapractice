package exception;

public class IllegalDate extends IllegalArgumentException {

	/**
	 * 非法日期例外
	 */
	private static final long serialVersionUID = -4605685540871165450L;

	public IllegalDate(String message) {
		super(message);
	}
	
	public IllegalDate() {
		super("非法的日期");
	}
}
