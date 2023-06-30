package ExceptionHandling;

import java.io.FileNotFoundException;

public class TestClassException {

	public static void main(String[] args) throws FileNotFoundException {
		ReadAndWriteClass rw = new ReadAndWriteClass();
		try {
			rw.readFile();
			rw.saveFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("Hello");
	}
}
