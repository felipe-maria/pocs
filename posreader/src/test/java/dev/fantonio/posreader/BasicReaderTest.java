package dev.fantonio.posreader;

import java.io.IOException;

import org.junit.Test;

public class BasicReaderTest {

	private BasicReader reader = new BasicReader();
	
	@Test
	public void test() throws IOException {
		reader.readFile("C:\\Users\\felip\\OneDrive\\Desktop\\arquivo");
	}

}
