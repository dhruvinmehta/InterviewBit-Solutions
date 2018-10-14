/**
 * https://www.interviewbit.com/problems/maximum-unsorted-subarray/
 *
 * @author Dhruvin Mehta
 */
public class Solution {
	public ArrayList<Integer> subUnsort(ArrayList<Integer> A) {
		ArrayList<Integer> result = new ArrayList<>();
		int start = -1;
		int end = -1;
		int size = A.size();

		for(int i=0; i<size - 1; i++) {
			if(A.get(i) > A.get(i + 1)) {
				start = i;
				break;
			}
		}

		if(start == -1) {
			result.add(-1);
			return result;
		}

		for(int i=size - 1; i>0; i--) {
			if(A.get(i) < A.get(i - 1)) {
				end = i;
				break;
			}
		}

		int min = A.get(start);
		int max = A.get(start);

		for(int i=start + 1; i<=end; i++) {
			if(A.get(i) < min) {
				min = A.get(i);
			} else if(A.get(i) > max) {
				max = A.get(i);
			}
		}

		for(int i=0; i<start; i++) {
			if(A.get(i) > min) {
				start = i;
				break;
			}
		}

		for(int i=size - 1; i>end; i--) {
			if(A.get(i) < max) {
				end = i;
				break;
			}
		}

		result.add(start);
		result.add(end);
		return result;
	}
}
