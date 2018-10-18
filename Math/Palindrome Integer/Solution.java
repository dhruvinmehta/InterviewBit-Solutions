/**
 * https://www.interviewbit.com/problems/palindrome-integer/
 *
 * @author Dhruvin Mehta
 */
public class Solution {
	public int isPalindrome(int A) {
		int B = 0;
		int num = A;

		while(num > 0) {
			B = (B * 10) + (num % 10);
			num /= 10;
		}

		if(A == B) {
			return 1;
		}
		return 0;
	}
}