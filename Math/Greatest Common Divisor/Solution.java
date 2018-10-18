/**
 * https://www.interviewbit.com/problems/greatest-common-divisor/
 *
 * @author Dhruvin Mehta
 */
public class Solution {
	public int gcd(int A, int B) {
		if(A == 0) {
			return B;
		}
		return gcd(B % A, A);
	}
}