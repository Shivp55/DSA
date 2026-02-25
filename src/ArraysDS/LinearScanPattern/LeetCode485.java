package ArraysDS.LinearScanPattern;

/** Question: Max Consecutive Ones
 * Given a binary array nums, return the maximum number of consecutive 1's
 * Input: nums = [1,1,0,1,1,1]
 * Output: 3
 * */
public class LeetCode485 {
	public static int consecutiveOnesInArray(int[] nums){
		int count =0;
		int maxCount = 0;
		for(int num:nums){
			if(num==1){
				count++;
				maxCount=Math.max(maxCount, count);
				System.out.println("Max count Increased: " + maxCount);
			}
			else{
				count =0;
				System.out.println("Count Decreased to : " + count);
			}
		}

		return maxCount;
	}

	public static void main(String[] args) {
		int[] nums = {1,1,1,1,0,1,1,1};
		System.out.println(consecutiveOnesInArray(nums));

	}

}
