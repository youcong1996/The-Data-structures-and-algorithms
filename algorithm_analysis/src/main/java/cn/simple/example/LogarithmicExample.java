package cn.simple.example;

public class LogarithmicExample {

	public static <AnyType extends Comparable<? super AnyType>> int binarySearch(AnyType[] a,AnyType x) {
		int low = 0,high = a.length-1;
		
		while(low <=high) {
			
			
			int mid = (low+high)/2;
			
			if(a[mid].compareTo(x) < 0)
				low = mid + 1;
			
			else if (a[mid].compareTo(x) > 0)
				high = mid - 1;
			
			else 
				return mid;
		}
		
		return -1;
	}
	
	public static long gcd(long m,long n) {
		while( n != 0) {
			
			long rem = m % n;
			m = n;
			n = rem;
		}
		
		return m;
	}
	
	public static long pow(long x , int n) {
		
		if( n == 0)
			return 1;
		if( n == 1)
			return x;
		if( isEven(n))
			return pow(x * x,n/2);
		else
			return pow(x * x,n/2) * x;
	}
	
	public static boolean isEven(int n) {
		
		return (n % 2 == 0);
	}
}
