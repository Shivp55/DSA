package ArraysDS.TwoPointers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Two sum II (Input array is sorted
 * Given a 1- index sorted array of integers numbers,
 * find the two numbers such that they add upto a specific target
 * Return their indices 1-based
 *
 * Input [] nums and target
 * Output is an array size 2
 * Input : [2,7,11,25]
 * target 9
 */
public class LeetCode167 {
	public static int[] twoSumII(int[] nums, int target) {
		int l=0,r=nums.length-1;
		while(l<r){
			int sum=nums[l]+nums[r];
			if(sum==target){
				return new int[]{l+1,r+1};
			}
			if(sum<target) l++;
			else r--;
		}
		return new int[]{-1,-1};
	}
	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		System.out.println(Arrays.toString(twoSumII(nums, target)));
	}
}
