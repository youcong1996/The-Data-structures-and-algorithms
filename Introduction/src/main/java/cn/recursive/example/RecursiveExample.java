package cn.recursive.example;

public class RecursiveExample {
    
	
      /**
       * 一个递归方法
       * @param x
       * @return
       */
	   public static int f(int x) {
		   
		   if (x == 0) {
			   
			   return 0;
		   }
		   
		   return 2 * f(x - 1) + x * x;
	   }
	   
	   /**
	    * 无终止递归方法
	    * @param n
	    * @return
	    */
	   public static int bad(int n) {
		   
		   if (n==0) {
			   
			   return 0;
	   
		   }else {
			   
			   return bad(n/3+1) +n-1;
		   }
	   }
	  

      
	   public static void main(String[] args) {
		   
	
		 //调用该方法，当x=2时，输出为6
		//System.out.println(RecursiveExample.f(-1));
		   
		  //无终止递归方法,会报错，报错信息主要是栈异常
		System.out.println(RecursiveExample.bad(-100));
	
	   }
}
