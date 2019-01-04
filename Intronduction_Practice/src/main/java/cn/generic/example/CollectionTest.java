package cn.generic.example;

import java.util.Arrays;
/**
 *设计一个泛型类Collection，它存储object对象的集合（在数组中），
 * 以及该集合当前的大小。提供public方法isEmtpy，makeEmpty,insert,remove,isPresent.
 * 方法isPresent(x)当且仅当在集合中存在（由equals定义） 等于x的一个object时返回true
 * @参考:https://www.cnblogs.com/1023linlin/p/6930549.html
 *
 * @param <E>
 */
public class CollectionTest<E> {

	
	private Object[] elementData;
	
	public void setElementData(Object[] obj) {
		
		this.elementData=obj;
	
	}
	
	public Object[] getElementData() {
		
		return elementData;
	}
	
	public boolean isEmpty() {
		
		return elementData.length == 0;
	}
	/**
	 * makeEmpty与List的clear()方法类似，Collection不为null,但是个数为0
	 */
	public void makeEmpty() {
		
		elementData = new Object[] {};
	}
	
	public void insert(E obj) {
		int length = elementData.length;
		Object[] temp = new Object[length+1];
		System.arraycopy(elementData,0,temp,0,length);;
		temp[length] = obj;
		elementData = temp;
	}
	
	public void remove(int index) {
		if(index < 0 || elementData == null) {
			
			return;
		
		}
	
	    int length = elementData.length;
	    
	    if((length-1)<index) {
	    	return;
	    }
	    
	    Object[] temp = new Object[length-1];
	    System.arraycopy(elementData, 0, temp, 0, index);
	    System.arraycopy(elementData, index+1, temp, index,length-index-1);
	    elementData = temp;
	    
	}
	
	public void remove(E obj) {
		
		if(elementData == null || obj == null) {
			return;
		}
		int length = elementData.length;
		for (int i = 0; i < length; i++) {
			
			if(elementData[i]!=null && elementData[i] == obj) {
				Object[] temp = new Object[length -1];
				System.arraycopy(elementData, 0, temp, 0, i);
				System.arraycopy(elementData, i+1, temp, i, length-i-1);
				elementData = temp;
				break;
			}
		}
	}
	
	public boolean isPresent(E obj) {
		
		if(elementData == null || obj == null) {
			return false;
		}
		
		boolean flag = false;
		
		for (int i = 0; i < elementData.length; i++) {
			
			if(null != elementData[i] && obj == elementData[i]) {
				
				flag = true;
				
				break;
			}
		}
		
		return flag;
	}
	
	
	public static void main(String[] args) {
		
		int i = 0;
		
		CollectionTest<String> collectionTest = new CollectionTest<String>();
		Object[] objects = new Object[] {"9"};
		collectionTest.setElementData(objects);
		collectionTest.insert("1");
		collectionTest.insert("2");
		collectionTest.insert("3");
		System.err.println(Arrays.toString(collectionTest.getElementData()));
		
		collectionTest.remove(0);
		
		System.err.println(Arrays.toString(collectionTest.getElementData()));
		
		collectionTest.remove("2");
		
		System.err.println(Arrays.toString(collectionTest.getElementData()));
		
		boolean flag = collectionTest.isEmpty();
		
		System.err.println("isEmpty:"+flag);
		
		boolean flag1 = collectionTest.isPresent("1");
		System.err.println("isPresent:"+flag1);
		
		collectionTest.makeEmpty();
		boolean flag2 = collectionTest.isEmpty();
		System.err.println("isEmpty:"+flag2);
	}
}
