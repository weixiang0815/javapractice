/**
 * 
 * 專門處理陣列的類別
 * @author henry
 * @version 0.1.1
 *
 */
public class Arraytools {
	/*public static void print(int[] data) throws Exception{
		if(data.length==0) {
			throw new Exception("陣列為空的");
		}
	}*/
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
	/*public static int sum(int[] data) throws Exception{
		if(data.length==0) {
			throw new Exception("陣列為空的");
		}
	}*/
	public static int sum(int[] data) {
		int sum=0;
		for (int i = 0; i < data.length; i++) {
			sum+=data[i];
		}
		return sum;
	}
	/*public static int max(int[] data) throws Exception{
		if(data.length==0) {
			throw new Exception("陣列為空的");
		}
	}*/
	public static int max(int[] data) {
		int max=0;
		for (int i = 1; i < data.length; i++) {
			if(data[i]>data[max]) {
				max=i;
			}
		}
		return data[max];
	}
	/*public static int min(int[] data) throws Exception{
		if(data.length==0) {
			throw new Exception("陣列為空的");
		}
	}*/
	public static int min(int[] data) {
		int min=0;
		for (int i = 1; i < data.length; i++) {
			if(data[i]<data[min]) {
				min=i;
			}
		}
		return data[min];
	}
	public static double avg(int[] data) {
		return (double)sum(data)/data.length;
	}
}
