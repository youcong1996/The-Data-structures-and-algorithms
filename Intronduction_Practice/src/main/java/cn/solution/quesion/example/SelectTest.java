package cn.solution.quesion.example;

import java.util.Arrays;
import java.util.Random;

public class SelectTest {
    
	/**

	* 创建随机数组

	*/

	public static final Random RANDOM = new Random(50);

	public int[] getRandomArray(int length) {

	int array[] = new int[length];

	for (int i = 0; i < length; i++) {

	array[i]= RANDOM.nextInt(length * 2);

	}

	return array;

	}


	public int[] sort(int []intArray){

	for(int i =1 ;i<intArray.length;i++){

	for(int j=0;j<intArray.length-i;j++){

	if(intArray[j]>intArray[j+1]){

	int temp = intArray[j];

	intArray[j] = intArray[j+1];

	intArray[j+1] = temp;

	}

	}

	}

	return intArray;

	}


	public int select(int []intArray){

	int k = intArray.length/2;

	System.out.println("k===="+k);

	intArray = this.sort(intArray);

	return intArray[k];

	}


	public static void main(String[] args) {

	SelectTest s = new SelectTest();

	int[] a = s.getRandomArray(11);

	for(int i =0;i<a.length;i++){

	System.out.println(a[i]);

	}

	int [] b = s.sort(a);

	System.out.println("====================");

	for(int i =0;i<b.length;i++){

	System.out.println(b[i]);

	}


	int kValue = s.select(a);

	System.out.println("====================");

	System.out.println(kValue);

	}
	
}
