/**
 * https://www.interviewbit.com/problems/first-missing-integer/
 *
 * @author Dhruvin Mehta
 */
public class Solution {
	public int firstMissingPositive(int[] A) {
		int index = 0;
		for(int i=0; i < A.length; i ++) {
			if(A[i] <= 0) {
				int temp = A[i] == 0 ? -1 : A[i];
				A[i] = A[index];
				A[index++] = temp;
			}
		}

		for(int i=index ; i< A.length; i++) {
			int absElement = Math.abs(A[i]);
			if(absElement <= A.length) {
				A[absElement - 1] = -A[absElement - 1];
			}
		}

		for(int i = 0; i < A.length; i++) {
			if((i < index && A[i] < 0 ) || (i >= index && A[i] > 0)) {
				return i + 1;
			}
		}
		return A.length + 1;
	}
}
