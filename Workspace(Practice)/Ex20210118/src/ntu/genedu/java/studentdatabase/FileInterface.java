package ntu.genedu.java.studentdatabase;

import java.io.IOException;

public interface FileInterface {


	public void saveFile(String fileName) throws IOException;
	
	public void readFile(String fileName) throws IOException;
}
