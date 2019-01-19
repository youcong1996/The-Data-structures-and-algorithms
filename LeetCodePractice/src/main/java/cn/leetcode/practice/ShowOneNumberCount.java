package cn.leetcode.practice;

import java.util.HashSet;
import java.util.Set;
/**
 * 只出現一次數字
 *
 */
public class ShowOneNumberCount {
	
	 public int singleNumber(int[] nums) {
	  Set<Integer> set = new HashSet<Integer>();
	  for (int i = 0; i < nums.length; i++) {
		if(!set.add(nums[i])) {
			set.remove(nums[i]);
		}
	 }
	  
	  return set.iterator().next();
		
	 }
	 
	 public static void main(String[] args) {
		 ShowOneNumberCount s = new ShowOneNumberCount();
		 int[] nums = new int[] {2,2,1};
		 System.out.println(s.singleNumber(nums));
	}
}
