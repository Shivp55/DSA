package ArraysDS.PrefixSum;

/**
 * Question: Find Pivot Index
 * Given an array of integers nums, return the pivot index
 * The pivot index is where:
 * sum of the elements to the left = sum of the elements to the right
 * Input : [1,7,3,6,5,6]
 * Output  = 3

 * Keywords :
 * It is a refinement of the sub array sum equals to k where instead of k it is the sum to the right
 *
 * Time and Space Complexity
 * One pass to compute the output -> O(n)
 *One pass to find the pivot -> O(n)
 *
 * Space Complexity : Only a few integers -> O(1)
 */

public class LeetCode724 {
	public static int pivotIndex(int[] arr) {
		int totalSum = 0;
		for (int x : arr) {
			totalSum += x;
		}
		int leftSum = 0;
		for (int i = 0; i < arr.length; i++) {
			int rightSum = totalSum - leftSum - arr[i];
			if (rightSum == leftSum) {
				return i;
			}
			leftSum += arr[i];
		}
		return -1;
	}

	static void main(String[] args) {
		int[] nums = {1, 7, 3, 6, 5, 6};
		System.out.println(pivotIndex(nums));
	}
}
