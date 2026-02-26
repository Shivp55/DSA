package ArraysDS.Kadane;

public class MaxCircularSubArraySum {
	public static int maxSubArraySum(int[] nums) {
		int currSum=nums[0], bestSum=nums[0];
		for(int i=1; i<nums.length; i++){
			currSum=Math.max(nums[i], currSum+nums[i]);
			bestSum=Math.max(bestSum, currSum);
		}
		System.out.println("Best: " + bestSum);
		return bestSum;
	}
	public static int minSubArraySum(int[] nums) {
		int currSum=nums[0], minSum=nums[0];
		for(int i=1; i<nums.length; i++){
			currSum=Math.min(nums[i], currSum+nums[i]);
			minSum=Math.min(currSum, minSum);
		}
		System.out.println("Min Sum: "+minSum);
		return minSum;
	}
	public static int maxCircularSubArraySum(int[] nums) {
		int maxNormal = maxSubArraySum(nums);
		if(maxNormal < 0) return maxNormal;

		int total =0;
		for(int x:nums){
			total += x;
		}
		System.out.println("total: "+total);
		int minSub=minSubArraySum(nums);
		int maxWrapSum =total -  minSub;
		return Math.max(maxNormal,maxWrapSum);
	}
	static void main (String [] args){
		int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
//		int [] nums = {5,-3,5};
		System.out.println(maxCircularSubArraySum(nums));
	}
}
