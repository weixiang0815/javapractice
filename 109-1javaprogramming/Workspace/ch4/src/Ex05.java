
public class Ex05 {

	public static void main(String[] args) {
		int one = max(10, 20);
		int two = max(10, 33, 4);
		float three = max(10.4f, 11.33f);
	}

	public static int max(int x, int y) {
		return ( x>y ) ? x : y;
	}
	
	public static int max(int x, int y, int z) {
		int max = max(x, y);
		return max(max, z);
	}
	
	public static float max(float x, float y) {
		return ( x > y) ? x : y;
	}
}
