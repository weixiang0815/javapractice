
public class Product {
	// Field 
	private String name;
	private int price;
	private int count;
	
	// Method
	/**
	 * 取得產品名稱
	 * @return 產品名稱
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * 修改產品名稱
	 * @param name 要修改的產品名稱
	 */
	public void setName(String name) {
		this.name = name;
	}
}
