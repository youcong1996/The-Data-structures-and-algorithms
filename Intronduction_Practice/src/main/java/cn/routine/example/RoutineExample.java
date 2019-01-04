package cn.routine.example;
/**
 * 
 *编写带有下列声明的例程：第一个例程是个驱动程序，它调用第二个例程并显示String str中的字符的所有排列。例如，str是"abc"， 那么输出的串则是abc，acb，bac，bca，cab，cba，第二个例程使用递归。
 *参考:https://www.cnblogs.com/1023linlin/p/6929724.html
 */
public class RoutineExample {

	public static void routine(String str) {
		char[] ch = str.toCharArray();
		
		routine(ch,0,ch.length-1);
	}
	
	public static void routine(char[] str,int low,int high) {
	
		int length = str.length;
		
		if(low == high) {
		
		String s = "";
		
		for (int i = 0; i < str.length; i++) {
			s += str[i];
		}
		
		System.out.println(s);
		}
		
		for (int i = low; i <length; i++) {
			
			swap(str,low,i);
			routine(str,low+1,high);
		    swap(str,low,i);
		}
		
	}
	
	public  static void swap(char[] str,int m,int n) {
		char temp = str[m];
		str[m] = str[n];
		str[n] = temp;
	}
	
	public static int is_swap(char[] str,int m,int n) {
		int flag = 1;
		
		for (int i = m; i < n; i++) {
		flag = 1;
		
		if(str[i]==str[n]) {
			
			flag = 0;
			
			break;
		}
		
		}
	return flag;
	
	}

    public static void main(String[] args) {
		routine("abc");
	}
}
