/**
 * https://www.interviewbit.com/problems/flip/
 *
 * @author Dhruvin Mehta
 */
public class Solution {
	public int[] flip(String A) {
		int length = A.length();

		int sum = 0;
		int leftIndex = 0;
		int rightIndex = 0;
		int start = 0;
		int maxSum = Integer.MIN_VALUE;
		int[] result = new int[2];

		int[] flip = new int[length];
		for(int i=0; i<length; i++) {
			if(A.charAt(i) == '0') {
				flip[i] = 1;
			} else {
				flip[i] = -1;
			}
		}

		for(int i=0; i<length; i++) {
			sum += flip[i];

			if(sum < 0) {
				start = i + 1;
				sum = 0;
			} else if (sum > maxSum){
				maxSum = sum;
				leftIndex = start;
				rightIndex = i;
			}
		}

		if(maxSum < 0) {
			return new int[0];
		}
		result[0] = leftIndex + 1;
		result[1] = rightIndex + 1;
		return result;
	}
}
