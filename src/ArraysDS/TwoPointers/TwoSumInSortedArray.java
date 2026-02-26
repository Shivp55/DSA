package ArraysDS.TwoPointers;

import java.util.Arrays;

/** Given a sorted array, find two numbers whose sum equals target
 * arr=[1,2,3,4,6]
 * target=6
 *Output = 2+4
 *
 * Why it works?
 * => if the sum is small - move the left pointer to the right
 * => if the sum is large, then ove the right pointer to the left
 */

public class TwoSumInSortedArray {
	public static int [] twoSumSortedArray(int [] arr, int target){
		int l=0,r=arr.length-1;
		while(l<r){
			int sum =  arr[l]+arr[r];
			if(sum==target){
				return new int[]{arr[l],arr[r]};
			}
			if(sum<target) l++;
			else r--;
		}

		return new int[]{-1,-1};
	}
	static void main(String [] args){
		int [] nums= {1,2,3,4,5,6};
		System.out.println(Arrays.toString(twoSumSortedArray(nums, 6)));
	}
}
