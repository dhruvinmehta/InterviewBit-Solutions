/**
 * https://www.interviewbit.com/problems/max-sum-contiguous-subarray/
 *
 * @author Dhruvin Mehta
 */
public class Solution {
	// DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
	public int maxSubArray(final int[] A) {
		int maxSum = A[0];
		int possibleSum = 0;
		for(int i=1; i<A.length; i++) {
			possibleSum = Math.max(possibleSum + A[i], A[i]);
			maxSum = Math.max(possibleSum, maxSum);
		}
		return maxSum;
	}
}

