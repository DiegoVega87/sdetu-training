package labs;

public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1! =  1;
		// 2! = 2 * 1
		// 3! = 3 * 2 * 1
		// 4! = 4 * 3 * 2 * 1
		
		System.out.println(factorial(5));
		System.out.println(sumN(4));
		int[] nums = {5,-2,0,234,-438,63};
		System.out.println(min(nums));
		System.out.println(average(nums));
		System.out.println(max(nums));
		System.out.println(factorial1(39));


	}
	public static long factorial(int n) {
		long[] cache = new long[n];
		
		if(n < 2) {
			 return 1;
		}
		
		if(cache[n-1] != 0) {
			return cache[n-1];
		}
		
		return cache[n-1] = n * factorial(n-1);
	}
	
	public static int sumN(int n) {
		
		if(n == 1) {
			return n;
		}
		
		return n + sumN(n-1);
	}
	
	public static int min(int[] nums) {
		
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < nums.length; i++) {
			
			min = Math.min(min, nums[i]);
		}
		
		return min;
	}
	
	public static double average(int[] nums) {
		
		double sum = 0;
		
		for(int i = 0; i < nums.length; i++) {
			
			sum += nums[i];
		}
		
		return (sum/nums.length);
	}
	
	public static int max(int[] nums) {
			
			int max = Integer.MIN_VALUE;
			
			for(int i = 0; i < nums.length; i++) {
				
				max = Math.max(max, nums[i]);
			}
			
			return max;
		}
	
	static int factorial1(int f){

		int factor=1;

		for (int i=1;i<=f;i++){

		factor=i*(factorial1(i-1));

		}

		return factor;

		}

}
