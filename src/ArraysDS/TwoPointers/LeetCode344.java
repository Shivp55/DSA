package ArraysDS.TwoPointers;

import java.util.Arrays;

/** Reverse a Character String array
 * Write a funtion that reverses a string
 * the input string is given as an array of characters char[]
 * You must modify the input array in-place with O(1) extra memory
 */
public class LeetCode344 {
	public static char [] reverseCharArray(char [] arr) {
		int l=0,r=arr.length-1;
		while(l<r){
			char temp=arr[l];
			arr[l]=arr[r];
			arr[r]=temp;
			l++;
			r--;
		}
		return arr;
	}
	static void main(String [] args){
		char[] arr= {'h','e','l','l','o'};
		System.out.println(Arrays.toString(reverseCharArray(arr)));
	}
}
