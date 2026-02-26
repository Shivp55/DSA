package ArraysDS.TwoPointers;

import java.util.Arrays;

/** Remove duplicates from a sorted array
 * This is slightly different from a reverse Array method
 * We are going to use the same direction pointers Slow and a Fast Pointer
 * input : [1,1,2,2,2,3]
 * Output: [1,2,3]
 */
public class RemoveDuplicatesInASortedArray {
	public static int[] removeDupSortedArray(int[] nums) {
		if (nums == null || nums.length == 0) {
			return nums;
		}
		int slow =0;
		for(int fast=1; fast<nums.length; fast++) {
			if(nums[fast]!=nums[slow]) {
				slow++;
				nums[slow] = nums[fast];
			}
		}
		return Arrays.copyOf(nums,slow+1);
	}
	static void main(String[] args) {
		int[] arr = { 1,1,2,2,2,3,3 };
		System.out.println(Arrays.toString(removeDupSortedArray(arr)));
	}
}
