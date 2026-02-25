package ArraysDS.PrefixSum;

/** Question: Range sum Query - Immutable
 * Given an integer array nums, handle multiple queries of the following type:
 * sumRange(left,right);
 *
 * Return the sum of elements between indices left nd right inclusive
 * Input : nums=[-2,0,3,-5,2,-1]
 *Output:
 * sumRange(0,2) -> 1
 * sumRange(2,5) ->1
 *
 * */

/** Matching Keywords:
 * multiple queries
 * range rum
 * */
public class LeetCode303 {
	public static int sumRange(int [] num, int left, int right) {
		int [] prefix = new int[num.length];
		prefix[0] = num[0];
		for(int i=1; i<num.length; i++) {
			prefix[i] = prefix[i-1] + num[i];
		}
		if(left==0){
			return prefix[right];
		}
		return prefix[right] - prefix[left-1];
	}
	static void main(String[] args) {
		int[] arr = {-2,0,3,-5,2,-1};
		System.out.println(sumRange(arr, 2, arr.length - 1));
	}
}
