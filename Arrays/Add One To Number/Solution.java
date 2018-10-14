/**
 * https://www.interviewbit.com/problems/add-one-to-number/
 *
 * @author Dhruvin Mehta
 */
public class Solution {
	public int[] plusOne(int[] A) {
		int carry = 1;
		int length = A.length;

		for(int i = length - 1; i >= 0; i--) {
			if(carry == 0) {
				break;
			}

			int sum = A[i] + carry;
			if(sum < 10) {
				carry = 0;
				A[i] = sum;
			} else {
				carry = 1;
				A[i] = sum % 10;         
			}
		}

		if(carry != 0) {
			int[] B = new int[A.length + 1];
			B[0] = 1;
			for(int i=0; i<A.length; i++) {
				B[i + 1] = A[i];
			}
			return B;
		}

		int index = 0;
		while(index < A.length && A[index] == 0) {
			index++;
		}
		int[] B = new int[A.length - index];
		for(int i = 0; i < B.length; i++) {
			B[i] = A[i + index];
		}
		return B;
	}
}
