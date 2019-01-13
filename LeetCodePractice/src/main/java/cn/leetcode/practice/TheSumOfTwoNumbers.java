package cn.leetcode.practice;

import java.util.HashMap;
import java.util.Map;
/**
 * 问题:两数之和
 * 一共有三种解法
 */
public class TheSumOfTwoNumbers {
	
	
	
	/**
	 * 暴力法
	 * 暴力法很简单。遍历每个元素x,并查找是否存在一个值与target - x相等的目标元素
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] twoSum1(int[] nums,int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if(nums[j] == target - nums[i]) {
					
					return new int[] {i,j};
				}
			}
		}
		
		throw new IllegalArgumentException("No two sum solution");
		
	}
	
	/**
	 * 两遍哈希表
	 * @param nums
	 * @param target
	 * @return
	 */
	public int [] twoSum2(int[] nums,int target) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		
		
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
		    
			if(map.containsKey(complement) && map.get(complement) != i) {
				return new int[] {i,map.get(complement)};
			}
		
		}
		throw new IllegalArgumentException("No two sum Solution");
	}
	
	
	/**
	 * 一遍哈希表
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] twoSum3(int [] nums,int target) {
       
	   HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
	   int[] res = new int[2];
	  
		for(int i = 0;i<nums.length;++i) {
			if(m.containsKey(target - nums[i])) {
				res[0] = i;
				res[1] = m.get(target - nums[i]);
				
				break;
			}
			
			m.put(nums[i], i);
			
		}
	  return res;
	 
	}
	
	

	

	

	
	
	
}
