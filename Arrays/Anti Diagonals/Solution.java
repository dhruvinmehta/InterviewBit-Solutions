/**
 * https://www.interviewbit.com/problems/anti-diagonals/
 *
 * @author Dhruvin Mehta
 */
public class Solution {
	public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
		int row = A.size();
		int col = A.get(0).size();

		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		for(int i=0; i<col; i++) {
			int r = 0;
			int c = i;
			ArrayList<Integer> temp = new ArrayList<>();
			while(r < row && c >= 0) {
				temp.add(A.get(r).get(c));
				r++;
				c--;
			}
			result.add(temp);
		}

		for(int i=1; i<row; i++) {
			int r = i;
			int c = col - 1;
			ArrayList<Integer> temp = new ArrayList<>();
			while(r < row && c >= 0) {
				temp.add(A.get(r).get(c));
				r++;
				c--;
			}
			result.add(temp);
		}
		return result;
	}
}
