import java.util.InputMismatchException;
import java.util.Scanner;
public class Exception_Handling {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try{
			System.out.println("Enter a whole number to divide: ");
			int x = in.nextInt();
			System.out.println("Enter a whole number to divide by: ");
			int y = in.nextInt();
			
			int z = x/y;
			System.out.println("result: "+z);
		}
		catch(ArithmeticException e) {
			System.out.println("You can't divide by zero!");
		}
		catch(InputMismatchException e) {
			System.out.println("PLEASE ENTER A NUMBER!!!!!");
		}
		catch(Exception e) {
			System.out.println("Something went wrong");
		}
		finally {
			System.out.println("This will always print");
			in.close();
		}
	}

}
