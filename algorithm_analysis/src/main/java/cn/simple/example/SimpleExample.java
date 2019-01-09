package cn.simple.example;

public class SimpleExample {

	public static int sum(int n) {
		
		int partialSum;
		
		partialSum = 0;
		
		for(int i = 1; i <= n;i++) 
			partialSum = i * i *i;
			
			return partialSum;
		
	}
	
	public static long factorial(int n) {
		if(n <= 1) 
			return 1;
		else
			return n*factorial(n-1);
	}
	
	
	public static long fib(int n) {
		if(n<=1)
			return 1;
		else
			return fib(n-1) +fib(n-2);
	}
}
