/**
 * https://www.interviewbit.com/problems/max-non-negative-subarray/
 *
 * @author Dhruvin Mehta
 */
public class Solution {
	public int[] maxset(int[] A) {
		long possibleSum = 0;
		long sum = 0;
		int start = 0;
		int end = 0;

		for(int i=0; i<A.length; i++) {
			possibleSum = 0;
			int currentIndex = i;
			while(i < A.length && A[i] >= 0) {
				possibleSum += A[i];
				i++;
			}

			if(possibleSum > sum) {
				start = currentIndex;
				end = i - 1;
				sum = possibleSum;
			} else if(possibleSum == sum) {
				if((end - start) < (i - 1 - currentIndex)) {
					start = currentIndex;
					end = i - 1;
				} else if((end - start) == (i - 1 - currentIndex) && start > currentIndex) {
					start = currentIndex;
					end = i - 1 - currentIndex;
				}
			}
		}

		if(start == end && A[start] < 0) {
			return new int[0];
		}

		int[] result = new int[end - start + 1];
		int index = 0;
		for(int i=start; i<=end; i++) {
			result[index] = A[i];
			index++;
		}
		return result;
	}
}