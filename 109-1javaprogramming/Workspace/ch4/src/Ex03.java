public class Ex03 {
	static int v1 = 5;

	public static void method1() {
		int v2 = 0;
	}

	public static void main(String[] args) {
		int v1 = 10;
		int v2 = 10;
		int v3 = 0;
		
		method1();
		Ex02.method1();
		Ex01.method1();
		
		System.out.println("v1 = " + v1);
		System.out.println("Ex03.v1 = " + Ex03.v1);
		System.out.println("Ex02.v1 = " + Ex02.v1);
		System.out.println("Ex01.v1 = " + Ex01.v1);
	}
}
