package ArraysDS.LinearScanPattern;

/**Question: Contains Duplicate
 * Given an integer array, return true if any value appears atleast twice otherwise false
 * Input: nums =[1,2,3,1];
 * Output true
 * */

/** Keywords:
 * Count should be exactly one, not more than one
 **/

import java.util.Arrays;

/** Human thinking:
 * We need to run a loop from 1 step ahead and find out if there is any element more than once by defining an if condition inside the loop
 *  if there are two same elements the return true or else return false at last
 * */
/** Time and Space Complexity
 * Sorting -> O(n log n)
 * Loop -> O(n)
 * Total -> O(n log n)
 * Shortcut -> if using Arrays.sort -> assume O(n log n)
 *
 * Space Complexity:
 * No extra space : O(1)
 **/
public class LeetCode217 {
	public static boolean duplicateElementInArray(int[] nums){
		Arrays.sort(nums);
		for(int i = 1; i < nums.length; i++){
			if(nums[i] == nums[i-1]){
				return true;
			}
		}
		return false;

	}

	public static void main(String[] args) {
		int [] nums ={1,2,3,2};
		System.out.println(duplicateElementInArray(nums));
	}




}
