package basics;

public class SalaryCalculator {
	
	public static void main(String[] args) {
		
		//Create a variable to define our career
		
		//Declare a variable
		String career;
		System.out.println("Program is starting");
		
		//Define the variable
		career = "Software Developer";
		System.out.println("My career is: " + career);
		
		//Declare and Define
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 43.50;
		career = "Web Developer";
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My salary as a " + career + " at the rate of $" + rate + " per hour is $" + salary + " per year.");
		
		//Compute our annual salary
		// rate * hoursPerWeek * weeksPerYear
		
	}

}
