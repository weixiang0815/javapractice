package exception;

public class IllegalPrice extends IllegalArgumentException {

	/**
	 * 非法購買價格例外
	 */
	private static final long serialVersionUID = -529948955738248581L;

	public IllegalPrice (String message) {
		super(message);
	}
	
	public IllegalPrice () {
		super("非法的購買價格");
	}
}
