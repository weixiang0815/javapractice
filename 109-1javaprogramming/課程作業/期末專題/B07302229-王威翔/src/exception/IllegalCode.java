package exception;

public class IllegalCode extends IllegalArgumentException {

	/**
	 * 非法股票代號例外
	 */
	private static final long serialVersionUID = -5518837478853943340L;
	
	public IllegalCode(String message) {
		super(message);
	}

	public IllegalCode() {
		super("非法的股票代號");
	}
}
