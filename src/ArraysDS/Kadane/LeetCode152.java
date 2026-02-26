package ArraysDS.Kadane;

/** Maximum Product Subarray
 * Question: You are given an Integer array
 * Find the contiguous sub array containing atleast one number that has the largest product and return that product
 * A sub array is a contiguous part of the array
 *Input: nums:[2,3,-2,4]
 * Output: 6
 * Explanation: 2,3 has the largest product
 * Input 2: [-2,3,-4]
 * Output: 24
 * product of -2*3*-4 =24
 *
 */
public class LeetCode152 {
	public static long maxProductSubArray(int [] arr){
		long minEndingHere=arr[0], maxEndingHere=arr[0];
		long maxFinalProduct =0;
		for(int i=1;i<arr.length;i++){
			int x=arr[i];
			if(x<0){
				long temp=maxEndingHere;
				maxEndingHere=minEndingHere;
				minEndingHere=temp;
			}
			maxEndingHere=Math.max(x,maxEndingHere*x);
			minEndingHere=Math.min(x,minEndingHere*x);
			maxFinalProduct=Math.max(maxFinalProduct,maxEndingHere);
		}
	return maxFinalProduct;
	}
	static void main(String [] args){
		int[] arr={-2,3,-4};
		System.out.println(maxProductSubArray(arr));

	}
}
