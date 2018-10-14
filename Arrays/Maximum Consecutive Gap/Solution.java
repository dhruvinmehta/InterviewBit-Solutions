/**
 * https://www.interviewbit.com/problems/maximum-consecutive-gap/
 *
 * @author Dhruvin Mehta
 */ 
public class Solution {
	// DO NOT MODIFY THE LIST. IT IS READ ONLY
	public int maximumGap(final List<Integer> A) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int size = A.size();

		for(int i=0; i<size; i++) {
			min = Math.min(A.get(i), min);
			max = Math.max(A.get(i), max);
		}

		float interval = (float)(max - min) / ((float)size - 1);

		int[] maxBucket = new int[size - 1];
		int[] minBucket = new int[size - 1];

		Arrays.fill(maxBucket, Integer.MIN_VALUE);
		Arrays.fill(minBucket, Integer.MAX_VALUE);

		for(int i=0; i<size; i++) {
			if(A.get(i) == min || A.get(i) == max) {
				continue;
			}

			int bucketIndex = (int)Math.floor((A.get(i) - min) / interval);

			if(maxBucket[bucketIndex] == Integer.MIN_VALUE) {
				maxBucket[bucketIndex] = A.get(i);
			} else {
				maxBucket[bucketIndex]= Math.max(maxBucket[bucketIndex], A.get(i));
			}

			if(minBucket[bucketIndex] == Integer.MAX_VALUE) {
				minBucket[bucketIndex] = A.get(i);
			} else {
				minBucket[bucketIndex]= Math.min(minBucket[bucketIndex], A.get(i));
			}
		}

		int prev = min;
		int maxGap = 0;
		for(int i=0; i<size - 1; i++) {
			if(minBucket[i] == Integer.MAX_VALUE) {
				continue;
			}
			maxGap = Math.max(maxGap, minBucket[i] - prev);
			prev = maxBucket[i];
		}
		maxGap = Math.max(maxGap, max - prev);
		return maxGap;
	}
}

