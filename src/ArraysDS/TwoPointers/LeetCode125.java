package ArraysDS.TwoPointers;

import java.util.Arrays;

/** Palindrome
 * Given a string s, determine if it is a palindrome
 * Only consider alphanumberic characters and ignore cases
 * return true if it is palindrome else false
 * Input String
 * output is boolean
 */
public class LeetCode125 {

//	public static boolean palindromeString(String s){
//		char[] arr = s.toLowerCase().toCharArray();
//		StringBuilder sb=new StringBuilder();
//		for(char c : arr){
//			if(Character.isLetterOrDigit(c)){
//				sb.append(c);
//			}
//		}
//		arr=sb.toString().toCharArray();
//		int l=0, r=arr.length-1;
//		while(l<r){
//			if(arr[l]!=arr[r]){
//				return false;
//			}
//			l++;
//			r--;
//		}
//		return true;
//	}
	public static boolean palindromeString(String s){
		int left = 0, right = s.length() -1;
		while (left < right){
			while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
				left++;
			}
			while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
				right--;
			}
			if(s.toLowerCase().charAt(left) != s.toLowerCase().charAt(right)){
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	static void main (String [] args){
		String s="A man, a plan, a canal: Panama";
		char[] arr=s.toCharArray();
		System.out.println(palindromeString(s));

	}
}
