/**
 * https://www.interviewbit.com/problems/pascal-triangle/
 *
 * @author Dhruvin Mehta
 */
public class Solution {
	public ArrayList<ArrayList<Integer>> solve(int A) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		for (int i = 0; i < A; i++) {
			int val = 1;
			ArrayList<Integer> temp = new ArrayList<>();
			for (int j = 0; j <= i; j++) {
				temp.add(val);
				val = (val * (i - j)) / (j + 1);
			}
			result.add(temp);
		}
		return result;
	}
}
