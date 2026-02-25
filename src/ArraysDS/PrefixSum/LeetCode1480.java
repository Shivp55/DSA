package ArraysDS.PrefixSum;

import java.util.Arrays;

/** Given an array nums, return the running sum
 * runningsum[i] = sum(nums[0]....nums[i])
 * Input : nums=[1,2,3,4]
 * Output : [1,3,6,10]
 *
 */

public class LeetCode1480 {
	public static int[] prefixRunningSum(int[] nums) {
		if(nums.length == 0) return nums;
		int [] prefixSum = new int[nums.length];
		prefixSum[0] =nums[0];
		for(int i = 1; i < nums.length; i++){
			prefixSum[i] = prefixSum[i-1] + nums[i];
		}
		return prefixSum;
	}
	static void main(String[] args){
		int [] nums={1,2,3,4};
		System.out.println(Arrays.toString(prefixRunningSum(nums)).toString());


	}
}
