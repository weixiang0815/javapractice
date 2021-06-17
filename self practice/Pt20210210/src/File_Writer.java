import java.io.FileWriter;
import java.io.IOException;

public class File_Writer {

	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("C:\\Users\\henry\\Desktop\\poem.txt");
			writer.write("Roses are red\nViolets are blue\nbooty booty booty\nRocking everywhere");
			writer.append("\n(A poem by Henry)");
			writer.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
