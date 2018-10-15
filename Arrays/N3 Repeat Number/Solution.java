/**
 * https://www.interviewbit.com/problems/n3-repeat-number/
 *
 * @author Dhruvin Mehta
 */
public class Solution {
	// DO NOT MODIFY THE LIST
	public int repeatedNumber(final List<Integer> a) {
		int n = a.size();
		int k = 3;
		int[] count = new int[k - 1];
		int[] bag = new int[k - 1];
		
		for(int i = 0; i < k - 1; i++) {
			bag[i] = Integer.MAX_VALUE;
		}

		for(int i = 0; i < n; i++) {
			int j;
			for(j = 0; j < k - 1; j++) {
				if(bag[j] == a.get(i)) {
					count[j]++;
					break;
				} 
			}

			if(j == k - 1) {
				int l;
				for(l = 0; l < k - 1; l++) {
					if(count[l] == 0) {
						count[l]++;
						bag[l] = a.get(i);
						break;
					} 
				}

				if(l == k - 1) {
					for(l = 0; l < k - 1; l++) {
						count[l]--;
					}
				}
			}
		}

		for(int j = 0; j < k - 1; j++) {
			int finalCount = 0;
			for(int i = 0; i < n; i++) {
				if(bag[j] == a.get(i)) {
					finalCount++;
				}
			}

			if(finalCount > n / k) {
				return bag[j];
			}
		}
		return -1;
	}
}
