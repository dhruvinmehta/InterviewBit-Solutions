/**
 * https://www.interviewbit.com/problems/prime-sum/
 *
 * @author Dhruvin Mehta
 */
public class Solution {
	public ArrayList<Integer> primesum(int A) {
		boolean[] isPrime = getAllPrimes(A);
		ArrayList<Integer> result = new ArrayList<>();

		for(int i = 0; i <= A / 2; i++) {
			if(isPrime[i] && isPrime[A - i]) {
				result.add(i);
				result.add(A - i);
				break;
			}
		}
		return result;
	}

	public boolean[] getAllPrimes(int A) {
		boolean[] isPrime = new boolean[A + 1];
		for(int i = 2; i <= A; i++) {
			isPrime[i] = true;
		}

		for(int i = 2; i <= Math.sqrt(A); i++) {
			if(isPrime[i]) {
				for(int j = i * 2; j <= A; j+=i) {
					isPrime[j] = false;
				}
			}
		}
		return isPrime;
	}
}
