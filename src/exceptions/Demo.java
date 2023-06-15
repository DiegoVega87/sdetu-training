package exceptions;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Progam starts");		
		doMath(12, 0);
		System.out.println("Program continues");

	}
	
	public static void doMath(int a, int b) {
		
		answer(a, b);
	}
	
	public static double answer(int x, int y) {
		// Catch the error here
		return x/y;
	}

}
