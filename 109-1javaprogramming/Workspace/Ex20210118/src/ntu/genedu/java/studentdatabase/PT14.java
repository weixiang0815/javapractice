package ntu.genedu.java.studentdatabase;

import java.io.IOException;

public class PT14 {

	public static void main(String[] args) {
		Student s = new Student("張三", 98, 78, 30);

		FileHelper fh = new FileHelper(s, "s.csv");
		
		try {
			fh.Save();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("程式結束");
	}

}
