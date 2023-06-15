package exceptions;

import java.util.Scanner;

public class PaymentsApp {

	// Take a payment from the user.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double payment = 0;
		
		do {
			// 1. Ask the user for input
			System.out.print("Enter the payment amount: ");
			
			// 2. Get the amount and test the value
			Scanner in = new Scanner(System.in);
			
			// 3. Handle exceptions appropriately
			try {
				payment = in.nextDouble();
				if(payment < 0) {
					throw new NegativePaymentException(payment);
				}
			}catch (NegativePaymentException e) {
				System.out.println(e.toString());
				System.out.println("Please try again...");
			}
		}while(payment < 0);
		
		// 4. Print confirmation
		System.out.println("Thak you for your payment of $" + payment);

	}

}
