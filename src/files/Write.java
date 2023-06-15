package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Define the path that we want to write
		String filename = "D:\\Programming\\Workspaces\\Files\\FileToWrite.txt";
		String message = "I'm writing data that will be placed in a file";
		
		// 2. Create the file in java
		File file = new File(filename);
		
		// 3. Open the file
		FileWriter fw;
		try {
			fw = new FileWriter(file);
			
			// 4. Write to the file
			fw.write(message);
			
			// 5. Close the resources
			fw.close();

		} catch (IOException e) {
			System.out.println("ERROR: Could not read file: " + filename);
			e.printStackTrace();
		}finally {
			System.out.println("Closing the filewriter");
		}
		

		
		
	}

}
