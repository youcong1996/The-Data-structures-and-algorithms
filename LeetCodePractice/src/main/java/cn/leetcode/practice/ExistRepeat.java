package cn.leetcode.practice;

import java.util.HashSet;
/**
 * 
 * 其实思路不是那么难
 * 之所以使用HashSet是因为HashSet是无序唯一的(hashset不允许重复的元素)，而数组可以是无序也可以是有序，允许重复元素，
 * 通过hashSet.size()我们可以排除那些是不重复的元素有多少，通过数组的length我们可以获取元素有多少，两者进行比较，如果相同，两者的数量是一样的，则说明元素不存在重复，如果
 * 两者数量不一致存在重复元素(方法内的输出语句就可以很好的比较结果)
 */
public class ExistRepeat {

	 public boolean containsDuplicate(int[] nums) {
	        
	     HashSet<Integer> hashSet = new HashSet<Integer>();
	     for (int i = 0; i < nums.length; i++) {
			
	    	 hashSet.add(nums[i]);
		}
	     System.out.println("hashSize:"+hashSet.size());
    	 System.out.println("numsLength:"+nums.length);
	     if(hashSet.size() == nums.length) {
	    	
	    	 return false;
	     }else {
	    	 return true;
	     }
	 
	 }
	 
	 public static void main(String[] args) {
		
		 //int[] nums = new int [] {1,1,1,3,3,4,3,2,4,2};
		 int[] nums = new int [] {1,2,3,4};
		 ExistRepeat e = new ExistRepeat();
		
		 System.out.println(e.containsDuplicate(nums));
	}
}
