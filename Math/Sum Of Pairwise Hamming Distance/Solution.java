/**
 * https://www.interviewbit.com/problems/sum-of-pairwise-hamming-distance/
 *
 * @author Dhruvin Mehta
 */
public class Solution {
	// DO NOT MODIFY THE LIST. IT IS READ ONLY
	public int hammingDistance(final List<Integer> A) {
		long ans = 0;
		int size = A.size();
		for(int i = 0; i < 31; i++) {
			long count = 0;
			for(int j = 0; j < size; j++) {
				if((A.get(j) & (1 << i)) == 0) {
					count++;    
				}
			}
			ans = (ans + count * (size - count) * 2) % 1000000007;
		}
		return (int)(ans % 1000000007);
	}
}

