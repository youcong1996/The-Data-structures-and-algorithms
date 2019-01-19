package cn.leetcode.practice;

import java.util.Arrays;

public class RotateArray {
	
	public void rotate(int[] nums,int k) {
		
		if(nums == null || nums.length ==0 || k % nums.length == 0)
			return;
		
		int turns = k % nums.length;
		
		int middle = nums.length - turns;
		
		reverse(nums,0,middle-1);
		
		reverse(nums,middle,nums.length-1);
		
		reverse(nums,0,nums.length-1);
		
	}
	
	
	public void reverse(int[] arr,int s,int e) {
		
		while(s < e) {
			int temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;
			
			s++;
			e--;
		}
	}
	
	public static void main(String[] args) {
		RotateArray r = new RotateArray();
		int[] nums = new int[] {1,2,3,4,5,6};
		
		r.rotate(nums, 3);
	}
}
