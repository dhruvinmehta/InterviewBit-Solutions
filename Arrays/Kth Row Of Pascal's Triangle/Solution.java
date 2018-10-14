/**
 * https://www.interviewbit.com/problems/kth-row-of-pascals-triangle/
 *
 * @author Dhruvin Mehta
 */
public class Solution {
	public ArrayList<Integer> getRow(int A) {
		int val = 1;
		ArrayList<Integer> result = new ArrayList<>();
		for(int i=0; i<=A; i++) {
			result.add(val);
			val = (val * (A - i)) / (i + 1);
		}
		return result;
	}
}
