package ntu.genedu.java.studentdatabase;

import java.io.IOException;

public class FileHelper {

	private FileInterface fi;
	private String filename;
	
	public FileHelper(FileInterface fi, String filename) {
		this.fi = fi;
		this.filename = filename;
	}
	
	public void Save() throws IOException {
		fi.saveFile(this.filename);
	}
	
	public void Read() throws IOException {
		fi.readFile(this.filename);
	}
	
}
