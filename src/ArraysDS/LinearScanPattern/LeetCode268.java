package ArraysDS.LinearScanPattern;

import java.util.Arrays;

/** Question: Missing Number
 * Given an array nums containing n distinct numbers in the range [0,n], return the only number in the range that is missing.
 * Input: nums = [3,0,1]
 *Output: 2
 * */
public class LeetCode268 {
//	public static int findMissingNumberInTheRange(int[] nums) {
//		Arrays.sort(nums);  // => Sorting so time complexirty O(n log n)
//		for (int i = 0; i < nums.length; i++) {
//			if(nums[i]!=i){
//				return i;
//			}
//		}
//		return nums.length;
//	}

	// Using the most optimal solution that is using XOR it has time complexity of O(n) spc. O(1)
//	XOR cancels duplicates => a ^ a = 0
//	XOR all indices and values, missing number remains
	public static int findMissingNumberInTheRange(int[] nums) {
		int n = nums.length;
		int xor = 0;
		// XOR all indices 0..n and all numbers in an array
		for (int i = 0; i < n; i++) {
			xor ^= i;
			xor ^= nums[i];
		}
		xor ^= n;
		return xor;
	}
	public static void  main(String[] args) {
		int[] nums = {3,
				0,1};

		System.out.println(findMissingNumberInTheRange(nums));


	}
}
