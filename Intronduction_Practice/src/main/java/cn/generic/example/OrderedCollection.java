package cn.generic.example;
/**
 *设计一个泛型类orderedCollection，它存储的Comparable对象的集合（在数组中），以及该集合的当前大小。提供public方法isEmpty，makeEmpty，insert，remove，findMin和 findMax。
 *finfMin和findMax分别返回该集合中最小的和最大T对象的引用（如果该集合为空，则返回null）
 *参考:https://www.cnblogs.com/wangchaoBlog/p/6076904.html 
 *
 */
public class OrderedCollection {

	private Comparable[] obj;
	private int length;
	public Comparable[] getObj() {
		return obj;
	}
	public void setObj(Comparable[] obj) {
		this.obj = obj;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	public void makeEmpty() {
		obj = new Comparable[] {};
	}
	
	public Comparable findMin() {
		if(obj.length == 0) {
			
			return null;
		}
		
		int min = 0;
		for (int i = 0; i < obj.length; i++) {
			min = i;
		}
		
		return obj[min];
	}
	
	
	public Comparable findMax() {
		if(obj.length == 0) {
			
			return null;
		}
		
		int max = 0;
		
		for (int i = 0; i < obj.length; i++) {
			
			if(obj[i].compareTo(obj[max]) > 0) {
				max = i;
			}
			
		}
		
		return obj[max];
	}
	
	
	public boolean isEmpty() {
		
		return obj.length > 0 ? false:true;
	}
	
	public void insert(Comparable o) {
		
		//扩展数组容量
		Comparable[] temp = new Comparable[obj.length + 1];
		
		//拷贝原有数组
		for (int i = 0; i < obj.length; i++) {
			temp[i] = obj[i];
		}
		
		//末位添加新元素
		temp[obj.length] = o;
		
		obj = temp;
		
		}

	public boolean isPresent(Comparable o) {
		
		if(obj.length == 0) {
			
			return false;
		}
		
		//遍历判断
		for(Comparable ob:obj) {
			
			if(o.equals(ob)) 
				
				return true;
			
		
		}
		
		return false;
		
		
	}
	
	
	public void remove(Comparable o) {
		
		if(obj.length == 0) {
			return;
		}
		
		int count = 0;
		
		for (int i = 0; i < obj.length; i++) {
			
			if(o.equals(obj[i])) {
				obj[i] = null;
				
				count ++;
			}
		}
		
		Comparable[] temp = new Comparable[obj.length - count];
		
		int i = 0;
		
		for(Comparable ob:obj) {
			
			if(ob != null) {
				
				temp[i] = ob;
				
				i++;
			}
			
		}
		
		obj = temp;
	}
	
	public static void main(String[] args) {
		
		OrderedCollection oc = new OrderedCollection();
		
	    Comparable[] obj = new Comparable[] {12,4,6,2,68};
	    
	    oc.setObj(obj);
	    
	    System.err.println(oc.findMin());
	    
	    System.err.println(oc.getLength());
	}
}
