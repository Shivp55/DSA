package ArraysDS.PrefixSum;

/** Question : Sub Array Sum equals k
 * Given an integer array nums and an integer k, return the number of subarrays whose sum equals k.
 * Input: [1,1,1], k=2
 *
 * */

/** Keywords:
 * Sum equals Integer k
 * no. of sub arrays
 * array may contain negatives
 *** If negatives exist then Sliding window doesn't work
 * Prefix sum + HashMaps work best
 * */

import java.util.HashMap;
import java.util.Map;

/** Core Idea:
 * currentPrefix - oldPrefix = k
 * => oldPrefix = currentPrefix - k
 * We need to calculate the prefix
 * We need to check how many times the old prefix appeared
 * */

/** Time and space complexity
 * Since there is a for loop,
 * then the total time becomes O(n)
 *
 * Space complexity:
 * Declaring few local variables -> O(1)
 * We are initializing a map so -> map grows with n -> O(n)
 * Total Space Complexity->  O(n)
 *
 * */
public class LeetCode560 {

	public static int subArraySumEqualsK(int [] arr, int k ){
		Map<Integer, Integer> map = new HashMap<>();
		// prefix sum 0 appear once (1)
		map.put(0, 1);
		int prefix = 0;
		int count =0;
		for(int num : arr){
			prefix+=num;

			//Check if (prefix - k) exists
			if(map.containsKey(prefix - k)){
				count +=map.get(prefix - k);
			}
			//Update the frequency of current prefix
			map.put(prefix, map.getOrDefault(prefix, 0) + 1);
		}
		return count;
	}
	static void main(String [] args){
		int [] arr = {1,1,1,1};
		System.out.println(subArraySumEqualsK(arr, 2));
	}
}
