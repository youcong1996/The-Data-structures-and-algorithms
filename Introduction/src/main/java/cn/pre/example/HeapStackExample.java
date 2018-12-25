package cn.pre.example;

import java.awt.HeadlessException;

public class HeapStackExample {

	
	public static void stackTest() {
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1==s2);
	}
	
	public static void heapTest() {
		
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1==s2);
	}

   public static void main(String[] args) {
	
	  HeapStackExample.stackTest();
	  HeapStackExample.heapTest();
}

}
