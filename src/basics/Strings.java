package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		bookTitle = "The lord fo the Rings";
		String wordChoice = "Ring";
		
		if(bookTitle.contains(wordChoice)) {
			System.out.println("The book contains the word " + wordChoice);
		}
		
		String browser = "Chrome";
		if(browser.equalsIgnoreCase("chrome")){
			System.out.println("The browser is chrome");
		}
		
		String firstName = "Diego";
		String lastName = "Vega";
		String SSN = "985454258";
		
		System.out.println("There are " + SSN.length() + " digits in yout SSN.");
		// Print the initials plus last 4 digits of SSN;
		System.out.print(firstName.substring(0, 1));
		System.out.print(lastName.substring(0, 3));
		System.out.println(SSN.substring(5));
	}

}
