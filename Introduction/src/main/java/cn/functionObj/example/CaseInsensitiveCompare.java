package cn.functionObj.example;

import java.util.Comparator;

import cn.pre.example.FindMaxDemo;

public class CaseInsensitiveCompare implements Comparator<String> {
   

	@Override
	public int compare(String lhs, String rhs) {
		
		return lhs.compareToIgnoreCase(rhs);
	}
	

	public static<AnyType> AnyType findMax(AnyType[] arr,Comparator<? super AnyType> cmp) {
		
		int maxIndex = 0;
		
		for (int i = 0; i < arr.length; i++) 
			
			if(cmp.compare(arr[i], arr[maxIndex]) > 0)
				maxIndex = i;
		
		return arr [maxIndex];
			
	}

}



