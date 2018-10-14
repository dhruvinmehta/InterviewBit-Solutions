/**
 * https://www.interviewbit.com/problems/set-matrix-zeros/
 *
 * @author Dhruvin Mehta
 */
public class Solution {
	public void setZeroes(ArrayList<ArrayList<Integer>> a) {
		int n = a.size();
		int m = a.get(0).size();
		boolean firstColumnZero = false;

		for(int i=0; i<n; i++) {
			if(a.get(i).get(0) == 0) {
				firstColumnZero = true;
			}

			for(int j=1; j<m; j++) {
				if(a.get(i).get(j) == 0) {
					a.get(0).set(j, 0);
					a.get(i).set(0, 0);
				}
			}
		}

		for(int i = n - 1; i >= 0; i--) {
			for(int j = m - 1; j >= 1; j--) {
				if(a.get(i).get(0) == 0 || a.get(0).get(j) == 0) {
					a.get(i).set(j, 0);
				}
			}
			if(firstColumnZero) {
				a.get(i).set(0, 0);   
			}
		}
	}
}
