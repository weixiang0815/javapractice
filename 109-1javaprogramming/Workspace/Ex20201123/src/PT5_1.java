
public class PT5_1 {

	public static void main(String[] args) {
		int[] data=new int[]{13,25,39,19,9,47,10,57,58,283,43,349};
		
		// 將所有功能寫在一起比較不好
		// 總和
		int sum=Arraytools.sum(data);
		// 找最大值
		int max=Arraytools.max(data);
		// 找最小值
		int min=Arraytools.min(data);
		System.out.println("總和:"+sum);
		System.out.println("最大值:"+max);
		System.out.println("最小值:"+min);
		Arraytools.print(data);
	}

}
