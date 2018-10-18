/**
 * https://www.interviewbit.com/problems/reverse-integer/
 *
 * @author Dhruvin Mehta
 */
public class Solution {
	public int reverse(int A) {
		long B = 0;

		while(A != 0) {
			B = (B * 10) + (A % 10);
			A /= 10;
			if(B > Integer.MAX_VALUE || B < Integer.MIN_VALUE) {
				return 0;
			}
		}
		return (int) B;
	}
}