package ArraysDS.Kadane;

public class MaxSubArraySum {

	public static int maximumSubArraySum(int[] nums) {
		int currSum=nums[0];
		int maxSum=nums[0];
		for(int x=1; x<nums.length; x++){
			currSum=Math.max(nums[x],currSum+nums[x]);
			maxSum= Math.max(maxSum, currSum);
		}
		return maxSum;
	}
	static void main (String [] args){
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maximumSubArraySum(nums));
	}
}
