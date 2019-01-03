package cn.binary.example;
/**
 * 编写一种递归方法，它返回数N的二进制中表示1的个数。利用这样一个事实：N为奇数，其1的个数为N/2的二进制中1的个数加1
 * 参考:https://www.cnblogs.com/1023linlin/p/6927832.html
 *
 */
public class BinaryExample {

	public static int numOfEven(int x) {
		
		//递归必须要有基准，不然不会结束推进
		if(x == 0) {
			return 0;
		}else if(x%2 !=0) {
			return numOfEven(x>>1)+1;
		}else {
		   //可以用while减少遍历次数，也可以直接多几次遍历
		   while(x%2!=0) {
			   x=x>>1;
		   }
		}
		
		return numOfEven(x>>1);
	}
	
	public static void main(String[] args) {
		System.out.println(numOfEven(11));
		System.out.println(numOfEven(512));
	}
}
