/**
 * https://www.interviewbit.com/problems/largest-coprime-divisor/
 *
 * @author Dhruvin Mehta
 */
public class Solution {
	public int cpFact(int A, int B) {
		int X = A;
		int divisor = gcd(X, B);

		while(divisor != 1) {
			X = X / divisor;
			divisor = gcd(X, B);
		}
		return X;
	}

	public int gcd(int A, int B) {
		if(A == 0) {
			return B;
		}
		return gcd(B % A, A);
	}
}
