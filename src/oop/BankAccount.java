package oop;

public class BankAccount implements IRate{
	// Define variables
	String accountNumber;	
	// static >> belongs to the CLASS not the object
	// final >> constant (often static final)
	private static final String routingNumber = "0123456";
	
	// Instance variables
	private String name;
	private String SSN;
	String accountType;
	double balance = 0;
	
	// Constructor definitions: unique methods
		// 1. used to define / setup / initialize properties of an object
		// 2. implicitly called upon instantiation
		// 3. the same name as the class itself
		// 4. Constructors have NO return type
	BankAccount() {
		System.out.println("NEW ACCOUNT CREATED");
	}
	
	// Overloading: call same method name with different parameters
	BankAccount(String accountType){
		System.out.println("NEW ACCOUNT: " + accountType);
	}
	BankAccount(String accountType, double initDeposit){
		// initDeposit, accountType, msg are all LOCAL VARIABLES
		System.out.println("NEW ACCOUNT: " + accountType);
		System.out.println("INITIAL DEPOSIT OF: $" + initDeposit);
		String mgs = null;
		if(initDeposit < 1000) {
			mgs = "ERROR: Minimun deposit must be at least $1,000";
		
			
		}else {
			mgs = "Thanks for your initial deposit of: $" + initDeposit;
		}
		System.out.println(mgs);
		balance = initDeposit;
	}
	
	// Interface methods
	public void setRate() {
		System.out.println("Setting rate".toUpperCase());
	}
	
	public void increaseRate() {
		System.out.println("Increasing rate".toUpperCase());

	}
	
	
	// Getters / Setters
	
	// Allow the user to define the name
	public void setName(String name) {
		this.name ="Mr." + name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	// Define methods
	public void deposit(double amount) {
		balance += amount;
		showActivity("DEPOSIT");
	}
	
	void withdraw(double amount) {
		balance += amount;
		showActivity("WITHDRAW");
	}
	
	// Private: can only be called from within the class.
	private void showActivity(String activity) {
		System.out.println("YOUR RECENT TRANSACTION: " + activity);
		System.out.println("YOUR NEW BALANCE IS: $" + balance);
	}
	void checkBalance() {
		System.out.println("Balance is: " + balance);
	}
	
	void checkStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[ NAME: " + name + ". ACCOUNT #"  + accountNumber + ". ROUTING #" + routingNumber + ". BALANCE: $" + balance + " ]";
	}
}
