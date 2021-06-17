import exception.IllegalCode;
import exception.IllegalDate;
import exception.IllegalFee;
import exception.IllegalNumber;
import exception.IllegalPrice;

public class TradingRecord {
	//Field 欄位
	private String name;
	/**
	 * 股票名字
	 */
	private String code;
	/**
	 * 股票代碼(四位數)
	 */
	private String date;
	/**
	 * 購買日期
	 * YYYY/MM/DD
	 */
	private int number;
	/**
	 * 購買股數
	 * 一律以零股為單位計算
	 */
	private double price;
	/**
	 * 購買價格
	 */
	private int fee;
	/**
	 * 交易手續費
	 */
	
	/**
	 * 
	 * @param name
	 * @param code
	 * @param date
	 * @param number
	 * @param price
	 * @param fee
	 * @throws IllegalCode 當股票代碼不為4位正整數時產生的例外
	 * @throws IllegalDate 當購買日期不為YYYY/MM/DD格式時產生的例外
	 * @throws IllegalFee 當手續費為負數時產生的例外
	 * @throws IllegalNumber 當購買股數為負數時產生的例外
	 * @throws IllegalPrice 當購買價格為負數時產生的例外
	 */
	TradingRecord(String name,String code,String date,int number,double price,int fee)
			throws IllegalCode, IllegalDate, IllegalFee, IllegalNumber,IllegalPrice{
		
		boolean CodeError = false;
		if(code.length()!=4) {
			CodeError=true;
		}
		else {
			for(int i=0;i<4;i++) {
				if(code.charAt(i)<0&&code.charAt(i)>9) {
					CodeError=true;
					break;
				}
			}
		}
		boolean DateError = false;
		if(date.length()!=10){
			DateError=true;
		}
		else {
			for(int i=0;i<date.length();i++) {
				if(i==4||i==7) {
					if(date.charAt(i)!='/') {
						DateError=true;
						break;
					}
				}
				else {
					if(date.charAt(i)<0&&date.charAt(i)>9) {
						DateError=true;
						break;
					}
					if(date.charAt(i)>='a'&&date.charAt(i)<='z') {
						DateError=true;
						break;
					}
					if(date.charAt(i)>='A'&&date.charAt(i)<='Z') {
						DateError=true;
						break;
					}
				}
			}
		}
		boolean FeeError = fee < 0;
		boolean NumberError = number < 0;
		boolean PriceError = price < 0;
		
		if(CodeError||DateError||FeeError||NumberError||PriceError) {
			if(CodeError) {
				throw new IllegalCode();
			}
			if(DateError) {
				throw new IllegalDate();
			}
			if(FeeError) {
				throw new IllegalFee();
			}
			if(NumberError) {
				throw new IllegalNumber();
			}
			if(PriceError) {
				throw new IllegalPrice();
			}
		}
		
		this.code = code;
		this.date = date;
		this.fee = fee;
		this.name = name;
		this.number = number;
		this.price = price;
	}
	
	public static int costCalc(double price,int number,int fee) {
		return (int)(price*number)+fee;
	}
	
	public String getCSV() {
		return this.getJoinString(" ");
	}
	
	public String getJoinString(String sp) {
		StringBuilder str = new StringBuilder(128);
		str.append(this.name);
		str.append(sp);
		str.append(this.code);
		str.append(sp);
		str.append(this.date);
		str.append(sp);
		str.append(this.price);
		str.append(sp);
		str.append(this.number);
		str.append(sp);
		str.append(this.fee);
		return str.toString();
	}
	
	public String toString() {
		return this.getJoinString("\t");
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getCode() {
		return this.code;
	}
	
	public String getDate() {
		return this.date;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public int fee() {
		return this.fee;
	}
}
