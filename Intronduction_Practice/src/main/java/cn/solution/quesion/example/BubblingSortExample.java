package cn.solution.quesion.example;

import java.util.Arrays;

public class BubblingSortExample {

	public static void printArr(int[] numbers) {
		
		for (int i = 0; i < numbers.length; i++) {
			
			System.out.println(numbers[i]+",");
			System.out.println("");
		}
	}
	
	public static void bubblingSort(int[] numbers) {
		
		int temp = 0;
		
		int size = numbers.length;
		
		for (int i = 0; i < size-1; i++) {
			
			for (int j = 0; j < size-1-i; j++) {
				
			     
				if(numbers[j]>numbers[j+1]) {
					
					temp = numbers[j];
					
					numbers[j] = numbers[j+1];
					
					numbers[j+1] = temp;
					
					
				}
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		
		int[] numbers = new int[] {5,2,1,4,-20,-15};
		
		
		

	
	    System.out.println("----排序前 start----");
	    
	    printArr(numbers);
	    
	    System.out.println("----排序前 end----");
	    
	    
	    Arrays.sort(numbers);
	    System.out.println("使用JDK自带排序 start---");
	    
	    printArr(numbers);
	    
	    System.out.println("使用JDK自带排序 end");
	    
	    
	    
	    bubblingSort(numbers);
	    
	    System.out.println("---排序后 start ---");
	    
	    printArr(numbers);
	    
	    System.out.println("排序后 end ---");
	}
	
	
	
}
