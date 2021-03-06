import java.io.IOException;
import java.util.Scanner;

public class digital_clock {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		Scanner in = new Scanner(System.in);
		int hr = in.nextInt();
		int min = in.nextInt();
		int sec = in.nextInt();
		if( hr >= 24 || min >= 60 || sec >= 60 ) {
			System.out.println("An error has occurred!");
			in.close();
			System.exit(1);
		}
		in.close();
		
		while( true ) {
			System.out.printf("\nClock: %02d:%02d:%02d",hr,min,sec);
			sec++;
			if( sec == 60 ) {
				min++;
				sec*=0;
			}
			if( min == 60 ) {
				hr++;
				min*=0;
			}
			if( hr == 24 ) {
				hr*=0;
			}
			Thread.sleep(1000);
		}
		
	}

}
