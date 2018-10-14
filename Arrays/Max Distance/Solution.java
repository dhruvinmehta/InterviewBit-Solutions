/**
 * https://www.interviewbit.com/problems/max-distance/
 *
 * @author Dhruvin Mehta
 */
public class Solution {
	// DO NOT MODIFY THE LIST. IT IS READ ONLY
	public int maximumGap(final List<Integer> A) {
		int size = A.size();
		int[] min = new int[size];
		int[] max = new int[size];
		int i, j;
		int maxDistance = -1;

		min[0] = A.get(0);
		max[size - 1] = A.get(size - 1);

		for(i=1; i<size; i++) {
			min[i] = Math.min(A.get(i), min[i - 1]);
		}

		for(i = size - 2; i >= 0; i--) {
			max[i] = Math.max(A.get(i), max[i + 1]);
		}

		i = 0; 
		j = 0;

		while(i < size && j < size) {
			if(min[i] <= max[j]) {
			maxDistance = Math.max(maxDistance, j - i);
				j++;
			} else {
				i++;
			}
		}
		return maxDistance;
	}
}
