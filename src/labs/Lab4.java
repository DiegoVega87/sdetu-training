package labs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lab4 {
	
	/*Create a Credit Card Statement reader application

	Questions for this assignment
	Read a credit card CSV statement
	Creating a balance variable that calculates the running balance of the user’s account
	If the field says CREDIT, then add the amount to the balance
	If the field says DEBIT, then subtract the amount to the balance
	If the final amount is greater than zero, charge a 10% fee and warn the user
	If the final amount is zero, thank the user for their payments
	If the final amount is less than zero, thank the user for their payment and display their overpayment.
	
	*/
	
	public static void main(String[] args) {		
		String file = "D:\\Programming\\Workspaces\\Files\\CCStatements.csv";
		Lab4 lab4 = new Lab4(); // Need to instantiate container class in order to instantiate an inner class
		CCStatementReader statement =  lab4.new CCStatementReader(file);
		statement.readData();
		statement.getBalance();
		statement.printTransactions();
	
		
		

	}
	
	
class CCStatementReader{
	
	private List<String[]> charges;
	private double balance;
	private static final double SURCHARGE = 1.1;
	private String fileName;
	
	public CCStatementReader(String fileName) {
		charges = new ArrayList<String[]>();
		balance = 0;
		this.fileName = fileName;
	}
	
	public void readData() {
		
		try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
			String line;
			
			while((line = br.readLine()) != null){
				String[] data = line.split(",");
				charges.add(data);
			}
			
		} catch(FileNotFoundException e) {
			System.out.println("ERROR: File not found");
			System.out.println(e.getMessage());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			System.out.println("ERROR: Could not read the file");
			e1.printStackTrace();
		}
		
	}
	
	public void getBalance(){
		
		for(String[] data : charges) {
			if(data[1].equalsIgnoreCase("debit")) {
				balance -= Double.valueOf(data[3]);
			}else {
				balance += Double.valueOf(data[3]);
			}
		}
		
		String message = balance > 0 ? "You owe $" + (balance*=SURCHARGE) : balance == 0 ? "Thank your for your payment!" : "Thank your for your payment, your overpaid amount is $: " +
		(Math.abs(balance));
		
		System.out.println(message);
	}
	
	public void printTransactions() {
		System.out.println("DATE   | TRANSACTION |  VENDOR |  AMOUNT |  BALANCE");
		charges.forEach(t -> System.out.println(t[0] + "  |  " + t[1] + 
				"  |  " + t[2] + "  |  " + t[3]));
	}
}

}
