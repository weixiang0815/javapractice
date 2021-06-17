import java.util.ArrayList;
public class TradingRecordList  extends ArrayList<TradingRecord>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6144077861434285586L;


	public String toString() {
		String str = "";
		for (int i = 0; i < this.size(); i++) {
			str += this.get(i);
			str += "\n";
		}
		return str;
	}

}
