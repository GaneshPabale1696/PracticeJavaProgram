package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadAndWriteClass {

	void readFile() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("e:/abc.txt");
	}

	void saveFile() throws FileNotFoundException {
		String text = "this is demo";
		FileOutputStream fos = new FileOutputStream("e:/xyz.txt");
	}

}
	