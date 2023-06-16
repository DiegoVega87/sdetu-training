package DataStructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {

	public static void main(String[] args) {
		// This App will read data from a CSV file
		List<String[]> data = new ArrayList<String[]>();
		String fileName = "D:\\Programming\\Workspaces\\Files\\accounts.csv";
		String dataRow;
		
		try {
			// Open the file
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			
			
			// Read the data as long as it's not empty
			while((dataRow = br.readLine()) != null) {
				// Parse the data by commas
				String[] account = dataRow.split(",");
				data.add(account);
			}
						
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		for(String[] ac : data) {
			System.out.println("User: [ " + ac[0] + "Password: " + ac[1] + " 	]");
		}
	}

}
