/**
 * https://www.interviewbit.com/problems/sorted-permutation-rank/
 *
 * @author Dhruvin Mehta
 */
public class Solution {
	public int findRank(String A) {
		long ans = 1;
		int[] count = new int[A.length()];

		populateCount(count, A);

		int j = 0;
		for(int i = A.length() - 1; i >= 0; i--) {
			ans += (count[i] * factorial(j));
			ans %= 1000003;
			j++;
		}
		return (int)(ans % 1000003);
	}

	public int factorial(long n) {
		if(n <= 1) {
			return 1;
		}
		return (int)((n * factorial(n - 1)) % 1000003);
	}

	public void populateCount(int[] count, String A) {
		for(int i = 0; i < A.length(); i++) {
			for(int j = i; j < A.length(); j++) {
				if(A.charAt(i) > A.charAt(j)) {
					count[i]++;
				}
			}
		}
	}
}

