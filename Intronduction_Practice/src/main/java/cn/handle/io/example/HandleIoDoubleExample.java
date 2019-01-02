package cn.handle.io.example;
/**
 * 
 * 只使用处理I/O的printDigit方法,编写一种方法以输出任意Double型量(可以为负数)
 * 参考链接:https://blog.csdn.net/qq_41516626/article/details/81483612
 */
public class HandleIoDoubleExample {

	
	public static void output(double num) {
		
		if(num < 0) {
			System.out.print("-");
		}
		
		long digit =Math.abs( (long) num);
		
		if(digit < 1) {
			System.out.print("0");
		}else {
			printDigit(digit);
		}
		
		System.out.print(".");
		
		double decimal = Math.abs(num-(long)num);
		
		if(decimal > 0) {
			
			printDigit(decimal);
			
		}else {
			System.out.print("0");
		}
	}
	
	
	public static void printDigit(double num) {
		if(num >1) {
			printDigit((long)(num/10));
			System.out.print((long)(num%10));
		}else if(num >0 && num <1) {
			long digit = (long) (num*10);
			System.out.print(digit);
			printDigit(num*10 -digit);
			
		//这里会出现误差错误
		}else if(num ==1) {
			
			System.out.print("1");
		}
	}
	
	
	public static void main(String[] args) {
		output(675434.65);
	}
	
	
	
	
}
