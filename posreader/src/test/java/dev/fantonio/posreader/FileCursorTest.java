package dev.fantonio.posreader;

import java.io.IOException;
import java.io.RandomAccessFile;

import org.junit.Test;

public class FileCursorTest {

	private FileCursor cursor = new FileCursor();
	
	@Test
	public void test() throws IOException {
		String header = "SISFANTONI202009222345000000004                           ";
		RandomAccessFile raf = new RandomAccessFile("C:\\Users\\felip\\OneDrive\\Desktop\\arquivo","rws");
		String readLine = null;
//		raf.seek(60);
		raf.writeBytes(header);
		while((readLine = raf.readLine())!= null) {
			System.out.println(readLine);
		}
		
	}

}
