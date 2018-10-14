/**
 * https://www.interviewbit.com/problems/rotate-matrix/
 *
 * @author Dhruvin Mehta
 */
public class Solution {
	public void rotate(ArrayList<ArrayList<Integer>> A) {
		int n = A.size();
		for(int i=0; i<n/2; i++) {
			for(int j=i; j<(n - i - 1); j++) {
				int temp = A.get(i).get(j);

				A.get(i).set(j, A.get(n - j - 1).get(i));

				A.get(n - j - 1).set(i, A.get(n - i - 1).get(n - j - 1));

				A.get(n - i - 1).set(n - j - 1, A.get(j).get(n - i - 1));

				A.get(j).set(n - i - 1, temp);
			}
		}
	}
}
