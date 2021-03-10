
public class pt4 {
	public static void main(String[] arg) {
		String name = "Henry";
		int age = 21;
		int x = 3;
		int y = 4;
		int z = add(x,y);
		for (int i = 0; i < 10; i++) {
			hello(age,name);
		}
		System.out.println(z);
	}
	static int add(int x,int y) {
		return x+y;
	}
	static void hello() {
		System.out.println("Hello");
		System.out.println("");
	}
	static void hello(int i) {
		System.out.println("You are "+i+" years old!");
		System.out.println("");
	}
	static void hello(String s) {
		System.out.println("Hello, "+s+"!");
		System.out.println("");
	}
	static void hello(String s,int i) {
		System.out.println("Hello, "+s+"!");
		System.out.println("You are "+i+" years old!");
		System.out.println("");
	}
	static void hello(int i,String s) {
		System.out.println("Hello, "+s+"!");
		System.out.println("You are "+i+" years old!");
		System.out.println("");
	}
}