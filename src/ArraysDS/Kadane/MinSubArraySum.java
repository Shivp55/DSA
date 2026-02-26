package ArraysDS.Kadane;

import java.util.Arrays;

/** Minimum Sub Array sum
 * Useful for circular max sub array and some optimization problems
 *Input: [3,-4,2,-3,-1,7,-5]
 * Output: -6, start =1, end 4
 *
 */
public class MinSubArraySum {
	public static int[] minimumSubArraySum(int[] nums){
		int currSum=nums[0], minSum=nums[0];
		int start=0,end=0,tempStart=0;
		for(int i=1; i<nums.length;i++){
			if(nums[i]<currSum+nums[i]){
				currSum=nums[i];
				tempStart=i;
			}else{
				currSum=currSum+nums[i];
			}
			if(currSum<minSum){
				minSum=currSum;
				start=tempStart;
				end=i;
			}
		}
		return new int[]{minSum, start, end};
	}
	public static void main(String[] args) {
		int[] arr = {3,-4,2,-3,-1,7,-5};
		System.out.println(Arrays.toString(minimumSubArraySum(arr)));
	}
}
