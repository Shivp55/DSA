package ArraysDS.LinearScanPattern;

/** Question (Medium)
 * Given an array nums of size n, return the element that appears more than n/2 times.
 * You may assume the majority element exists.
 * */
/** Keywords
 * appears more than n/2 times
 * majority
 *
* */

/** Human thinking
 * First assign an integer to 0, and a count variable as well to 0;
 * then we need to run a for loop which will iterate over the nums array and then:
 * if the count is 0 -> initialize a new variable candidate, till the next candidate is same update bestSoFar++
 * if a new candidate shows up, then cancel the current using the new candidate by reducing the bestSoFar--
 * if the new candidate has more count than the previous one then the bestSofar will eventually become Zero, and when it becomes
 * Zero, we can define the current new candidate and increase the bestSoFar,
 * repeating the same step till the end of the array and eventually we will find the candidate with the highest count in the array
 * we will return the element at last
 * */

/**Psuedo Code
 * n = nums.length
 * array -> sort
 * if num == a => bestSoFar++
 * else => bestSoFar --
 *
 * */
/** Time and space complexity
 * we are looping in a single for loop so -> O(n)
 * Space complexity -> we are defining only two variables so -> O(1)
 * */
public class LeetCode169 {
	public static int majorityElementCount(int[] nums) {
		int a = 0;
		int bestCountSoFar = 0;
		for(int num:nums){
			if(bestCountSoFar ==0) a=num;
			if(a==num){
				bestCountSoFar+=1;
				System.out.println("Count of: " + a + " is " + bestCountSoFar);
			}else{
				bestCountSoFar--;
			}
		}
		return a;
	}

	public static void main(String[] args) {
		int[] arr = { 2,2,1,1,1,2,2 };
		int maxCount = majorityElementCount(arr);
		System.out.println(maxCount);
	}
}
