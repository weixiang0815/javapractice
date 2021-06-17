/**
 * 專門處理數學計算的類別
 * 
 * 2020/11/02 新增 max
 * 2020/12/07 新增 BMI計算
 * 
 * @author HenryWang
 * @version 2.0.0
 * @since 2020/11/02
 *
 */
public class MyMath {
	public static int max(int x,int y) {
		int ret = (x>y)? x:y;
		//若x>y，則ret為x;
		//若y>x，則ret為y;
		return ret;
	}
	public static int max1(int x,int y,int z) {
		int ret = (x>max(y,z))? x:max(y,z);
		return ret;
	}
	/**
	 * BMI(Body Mass Index)計算
	 * @param cm 身高(cm)
	 * @param kg 體重(kg)
	 * @return BMI 值
	 */
	public static double calcBMI(double cm,double kg) {
		// BMI 公式 = 體重(kg)/身高平方(m^2)
		
		double m=cm/100.0;
		return kg/(m*m);
	}
}
