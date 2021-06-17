package exception;

public class IllegalNumber extends IllegalArgumentException {

	/**
	 * 非法購買股數
	 */
	private static final long serialVersionUID = 4482529962908454481L;

	public IllegalNumber(String message) {
		super(message);
	}
	
	public IllegalNumber() {
		super("非法的購買股數");
	}
}
