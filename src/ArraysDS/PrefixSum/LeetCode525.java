package ArraysDS.PrefixSum;
/** Question: Given a binary array, return the maximum length of contiguous sub array with length with equal
 * number of 0's and 1's
 * Input: [0,1]
 * Output: 2
 */

import java.util.HashMap;
import java.util.Map;

/** Keywords
 * Maximum length of sub array
 * multiple queries
 */

public class LeetCode525 {

	public static int maximumBinarySubArrayLength(int [] nums){
		// map stores: count -> earliest index where this count occured
		Map<Integer, Integer> map = new HashMap<>();
		//count =0 accurs at index -1 before the array starts
		//This helps when the valid sub array starts at index 0
		map.put(0,-1);
		int count =0;
		int maxLen=0;
		for(int i = 0; i < nums.length; i++){
			//treat 0 as -1 and 1 as +1
			if(nums[i]==0) count-=1;
			else count+=1;

			//if we have seen this count before,
			//Subarray between firstIndex(count)+1 and i has equal 0s and 1s
			if(map.containsKey(count)){
				int len= i-map.get(count);
				maxLen = Math.max(maxLen,len);
			}else{
				// Store the first time we have seen this count
				//because earliest index gives the longest subarray later
				map.put(count,i);
			}
		}
		return maxLen;
	}
	static void main(String [] args){
		int[] arrBinary = {0,0,1,0,1,0};
		System.out.println(maximumBinarySubArrayLength(arrBinary));
	}
}
