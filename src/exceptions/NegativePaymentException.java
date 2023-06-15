package exceptions;

public class NegativePaymentException extends Exception{
	// Define class variable
	private double payment;
	
	// 1. Constructor that takes the value that would throw the exception
	public NegativePaymentException(double payment) {
		// Assign value of local variable to class variable
		this.payment = payment;
	}
	
	// Override the toString() method to include specific exception message.
	@Override
	public String toString() {
		return "ERROR: Cannot take negative payment " + payment ;
	}
}
