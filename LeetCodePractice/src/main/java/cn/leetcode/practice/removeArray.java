package cn.leetcode.practice;

import java.util.HashSet;

public class removeArray {
	public int removeDuplicates(int[] nums) {
     
	  if(nums.length == 0) {
    	  
    	  return 0;
      }
      
      int number = 0;
      
      for (int i = 0; i < nums.length; i++) {
		
    	  if(nums[i] != nums[number]) {
    		  
    		  number ++;
    		  
    		  nums[number] = nums[i];
    		  
    	  }
    	  
	}
      
    number +=1;
    
    return number;
    
    }
	
	public static void main(String[] args) {
		 int []nums = {1,2,4,4};
		 
		 removeArray r = new removeArray();
		
		 System.out.println(r.removeDuplicates(nums));
	}
}
