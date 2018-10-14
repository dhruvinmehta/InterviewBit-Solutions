/**
 * https://www.interviewbit.com/problems/repeat-and-missing-number-array/
 *
 * @author Dhruvin Mehta
 */
public class Solution {
	// DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
	public int[] repeatedNumber(final int[] A) {
		long n = A.length;
		int[] result = new int[2];
		long sum = (n * (n + 1)) / 2;

		long sumSquares = (n * (n + 1) * (2 * n + 1)) / 6;
		for(int i=0; i<n; i++) {
			sum -= (long) A[i];
			sumSquares -= (long) A[i] * (long) A[i];
		}
		result[1] = (int) (sum + sumSquares / sum) / 2; 
		result[0] = (int) (result[1] - sum);
		return result;
	}
}
