/**
 * https://www.interviewbit.com/problems/power-of-two-integers/
 *
 * @author Dhruvin Mehta
 */
public class Solution {
	public int isPower(int A) {
		if(A == 1) {
			return 1;
		}

		for(int p = 2; p <= Math.sqrt(A); p++) {
			double result = Math.log(A) / Math.log(p);
			if((result - (int)result) < 0.00000001) {
				return 1;
			}
		}
		return 0;
	}
}
