
public class Product {
	private String name;
	private int price,count;
	Product(String name,int price,int count){
		this.name=name;
		this.price=price;
		this.count=count;
	}
	public void setName(String n) {
		name=n;
	}
	public void setPrice(int p) {
		price=p;
	}
	public void setCount(int c) {
		count=c;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getCount() {
		return count;
	}
	public int getTotal() {
		return price*count;
	}
	public String toString() {
		String str="";
		if(this.name.length()>6) {
			str+=this.name.charAt(0)+this.name.charAt(1)+this.name.charAt(2)+this.name.charAt(3)+this.name.charAt(4);
			str+="[...]\t";
		}
		else {
			str+=this.name+"\t";
		}
		str+=this.price+"\t";
		str+=this.count+"\t";
		str+=this.getTotal();
		return str;
	}
}
