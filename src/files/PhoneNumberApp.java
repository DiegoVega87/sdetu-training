package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;

public class PhoneNumberApp {

	public static void main(String[] args) {
		// This will read a text file and will retrieve phone number
				
		String fileName = "D:\\Programming\\Workspaces\\Files\\PhoneNumber.txt";
		File file = new File(fileName);
		String phoneNum = null;	
		String[] phoneNums = new String[9];
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			for(int i = 0; i < phoneNums.length;i++) {
				phoneNums[i] = br.readLine();
			}
			
			br.close();
		}catch(FileNotFoundException e) {
			System.out.println("ERROR: file not found " + fileName);
		} catch (IOException e) {
			System.out.println("ERROR: Could not read file: " + fileName);
			e.printStackTrace();
		}
		
		// Valid phone number:
				// 10 digits long
				// Area code cannot start with 0 or 9
				// The can be 911 in the phone
		for(int j = 0;j < phoneNums.length;j++) {
			phoneNum = phoneNums[j];
			try {
				if(phoneNum.length() != 10) {
					throw new TenDigitsException(phoneNum);
				}
				if(phoneNum.charAt(0) < Character.valueOf('1') || phoneNum.charAt(0) > Character.valueOf('8') ) {
							
					throw new AreaCodeException(phoneNum);
				}
				
				for(int i = 0; i < phoneNum.length()-2; i++) {
					if(phoneNum.charAt(i) == '9') {
						if(phoneNum.substring(i+1, i+3).equals("11")) {
							throw new EmergencyException(phoneNum);
						}
					}
				}
				
				System.out.println(phoneNum);
			}catch(TenDigitsException e){
				System.out.println("ERROR: Phone number is not 10 digits");
				System.out.println(e.toString());
			} catch (AreaCodeException e) {
				System.out.println("ERROR: Phone number has invalid area code ");
				System.out.println(e.toString());
			} catch (EmergencyException e) {
				System.out.println("ERROR: Invalid 911 sequence found");
				System.out.println(e.toString());
			}
		}
		
	}

}

class TenDigitsException extends Exception{
	private String number;
	
	public TenDigitsException(String phoneNum) {
		number = phoneNum;
	}
	
	@Override
	public String toString() {
		return ("TenDigitsException: " + number);
	}
}

class AreaCodeException extends Exception{
	private String number;
	
	public AreaCodeException(String phoneNumber) {
		number = phoneNumber;
	}
	
	@Override
	public String toString() {
		return ("AreaCodeException " + number);
	}
}

class EmergencyException extends Exception{
	private String number;
	
	public EmergencyException(String phoneNumber) {
		number = phoneNumber;
	}
	
	@Override
	public String toString() {
		return ("EmergencyException: " + number);
	}
}
