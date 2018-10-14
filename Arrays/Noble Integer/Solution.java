/**
 * https://www.interviewbit.com/problems/noble-integer/
 *
 * @author Dhruvin Mehta
 */ 
public class Solution {
	public int solve(ArrayList<Integer> A) {
		Collections.sort(A);

		if(A.get(A.size() - 1) == 0) {
			return 1;
		}

		for(int i=0; i<A.size() - 1; i++) {
			if(A.get(i) == A.get(i + 1)) { 
				continue;
			}

			if(A.get(i) == A.size() - i - 1) {
				return 1;
			}
		}
		return -1;
	}
}
