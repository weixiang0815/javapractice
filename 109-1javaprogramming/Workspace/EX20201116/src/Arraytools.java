/**
 * 
 * 專門處理陣列的類別
 * @author henry
 * @version 0.1.0
 *
 */
public class Arraytools {
	public static void print(int[] data) {
		/**
		 * 將陣列的每個元素都印至Console
		 * @param data 一個int的陣列
		 */
		for(int i=0;i<data.length;i++) {
			System.out.print(data[i]);
			System.out.print("\t");
		}
	}
}
