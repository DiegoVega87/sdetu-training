package oop;

public class LoanAccount implements IRate{

	@Override
	public void setRate() {
		// TODO Auto-generated method stub
		System.out.println("Rate");
	}

	@Override
	public void increaseRate() {
		// TODO Auto-generated method stub
		System.out.println("Increase rate");
	}

	public void setTerm(int term) {
		System.out.println("Setting the term to: " + term + " years.");
	}
	
	public void setAmmortSchedule() {
		System.out.println("Amortization schedule");
	}
	

}
