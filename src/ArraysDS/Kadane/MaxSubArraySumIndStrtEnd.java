package ArraysDS.Kadane;

import java.util.Arrays;

/**Maximum Subarray sum + indices (Start,end)
 * Input: [-2,1,-3,4,-1,2,1,-5,4]
 * output: maxsum=6, strt =3, end =6
 */
public class MaxSubArraySumIndStrtEnd {
	public static int[] maxSubArrayWithIndices(int[] nums){
		int currSum=nums[0], best=nums[0];
		int start=0,end=0,tempStart=0;
		for(int i=1; i<nums.length; i++){
			if(nums[i]>currSum+nums[i]){
				currSum=nums[i];
				tempStart=i;
			}else{
				currSum+=nums[i];

			}
			if(currSum>best){
				best=currSum;
				start= tempStart;
				end=i;
			}
		}
		return new int[] {best, start, end};
	}
	public static void main(String [] args){
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(Arrays.toString(maxSubArrayWithIndices(nums)));
	}
}
