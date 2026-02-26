package ArraysDS.TwoPointers;

import java.util.Arrays;

/** Reverse array in-place
 * Input: [1,1,2,2,3]
 * Output: [3,2,2,1,1]
 *
 * Swap left and right and move inwards
 */
public class ReverseAnArray {
	public static int [] reverseASortedArray(int[] arr) {
		int l=0, r=arr.length-1;
		while(l<r){
			int temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			l++;
			r--;
		}
	return arr;

	}

	static void main(String[] args) {
		int[] arr = {1,1,2,2,3};
		System.out.println(Arrays.toString(reverseASortedArray(arr)));
	}


}
