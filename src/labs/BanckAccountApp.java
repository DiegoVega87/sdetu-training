package labs;

public class BanckAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc1  = new BankAccount("123194567", 1000.50);
		BankAccount acc2  = new BankAccount("789452345", 2000);
		BankAccount acc3  = new BankAccount("456781234", 2500);
		
		acc1.setNAme("Jim");
		System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		acc1.accrue();
		System.out.println(acc1.toString());

	}

}

class BankAccount implements IInterest{
	// Properties of BA
	private static int ID = 1000;					// Internal ID
	private String accountNumber;	// ID + random-2digit number + first 2 of SSN
	private static final String ROUTINGNUMBER = "00678900567";
	private String name;
	private String SSN;
	private double balance;
	
	// Constructor
	public BankAccount(String SSN, double initDeposit) {
		balance = initDeposit;
		this.SSN = SSN;
		ID++;
	
		setAccountNumber();
	
	}
	
	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		accountNumber = ID + "" + random +""+ SSN.substring(0,2);
		System.out.println("Your Account Number: "+accountNumber);
	}
	
	public void setNAme(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void payBill(double amount) {
		balance -= amount;
		System.out.println("Paying bill: " + amount);
		showBalance();
	}
	
	public void makeDeposit(double amount) {
		System.out.println("Making deposit: " + amount);
		balance += amount;
		showBalance();
	}
	
	private void showBalance() {
		System.out.println("Your balance is: " + balance);
	}

	@Override
	public void accrue() {
		// TODO Auto-generated method stub
		balance *= (1 + rate/100);
		showBalance();
	}
	
	@Override
	public String toString() {
		return "[Name: " + name + "]\n[Account Number: " + accountNumber + "]\n" + "[Routing Number: " + ROUTINGNUMBER + "]\n" + "[Balance: " + balance + "]";
	}
	
	
	
}