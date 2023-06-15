package labs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

	/*
	 * Read a file that checks the criteria for a password
	 	Read a file that contains multiple sets of passwords (use http://www.theonegenerator.com/
		to generate a set of test data).
		Verify that the password contains all of the following criteria:
			1. A number
			2. A letter
			3. Special character (! @ #)
		Create three User Defined Exceptions for the corresponding criteria.
		If the password does not meet the criteria, create and throw the appropriate exception
	*/

public class Lab3 {

	public static void main(String[] args) {
		
		
		String fileName = "D:\\Programming\\Workspaces\\Files\\Passwords.txt";
		List<String> pswrds = new ArrayList<String>(); // Container for the passwords read and stored.
		File file = new File(fileName);		
			try {
				
				Scanner sc = new Scanner(new FileReader(file)); // Scanner to read read the file
				
				while(sc.hasNextLine()) {
					pswrds.add(sc.nextLine());
				}
				
				sc.close();  // Closing the scanner
			}catch(FileNotFoundException e) {
				System.out.println("ERROR: File not found");
			}
			
			System.out.println(pswrds);
			
			Pattern noSpecialChar = Pattern.compile("[^a-z0-9]", Pattern.CASE_INSENSITIVE); // Pattern matcher to check if a given string contains a non letter/number char
		
			for(String password : pswrds) {
	
				Matcher match = noSpecialChar.matcher(password);
				
				try {
					// 1. A number
					if(!password.matches(".*\\d.*")) { // Case password contains no single digit
						throw new NoNumberException(password);
					}
					// 2. A letter
					if(!password.matches(".*[A-Za-z].*")) { // Case password contains no single letter
						throw new NoLetterException(password);
					}
					// 3. Special character (! @ #)
					if(!match.find()) { // Case password contains no single special character
						throw new NoSpecialCharacterException(password);
					}
				}catch(NoNumberException e) {
					System.out.println(e.toString());
				}catch(NoLetterException e) {
					System.out.println(e.toString());
				}catch(NoSpecialCharacterException e) {
					System.out.println(e.toString());
				}
			}
		}
	

}


class NoNumberException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String password;
	
	public NoNumberException(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		
		return "NoNumberException:" + password;
	}
	
}

class NoLetterException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String password;
	
	public NoLetterException(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		
		return "NoLetterException:" + password;
	}
	
}

class NoSpecialCharacterException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String password;
	
	public NoSpecialCharacterException(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		
		return "NoSpecialCharacterException:" + password;
	}
	
}