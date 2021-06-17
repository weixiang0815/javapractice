/**
 * 專門處理數學計算的類別
 * 
 * 2020/11/02 新增 max
 * 2020/12/07 新增 BMI計算
 * 
 * @author kChen
 * @version 0.2.1
 * @since 2020/11/02
 */
public class MyMath {

	/**
	 * 求兩數的最大值
	 * 
	 * @param x 一個整數
	 * @param y 一個整數
	 * @return 輸入兩個數字的最大值
	 */
	public static int max(int x, int y) {
		// 若 (x > y) 成立，則 return x;
		// 若 (x > y) 不成立，則 return y;
		return (x > y) ? x : y;
	}

	/**
	 * 求三數的最大值
	 * 
	 * @param x 一個整數
	 * @param y 一個整數
	 * @param z 一個整數
	 * @return 輸入三個數字的最大值
	 */
	public static int max(int x, int y, int z) {
		return max(max(x, y), z);
	}

	/**
	 * BMI(Body Mass Index)計算
	 * @param cm 身高(cm)
	 * @param kg 體重(kg)
	 * @return BMI 值
	 */
	public static double calcBMI(double cm, double kg) {
		// BMI 公式 = 體重(kg)/身高平方(m^2)，
		double m = cm / 100.0;
		return kg / (m * m);
	}
}
