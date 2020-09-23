package dev.fantonio.posreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BasicReader {
	
	public void readFile(String filepath) throws IOException {
		String readLine = null;
		BufferedReader br = new BufferedReader(new FileReader(filepath));
		while ((readLine = br.readLine()) != null) {
			System.out.println(readLine);
		}
	}
	
}
