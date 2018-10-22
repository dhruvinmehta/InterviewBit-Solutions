/**
 * https://www.interviewbit.com/problems/excel-column-title/
 *
 * @author Dhruvin Mehta
 */
public class Solution {
	public String convertToTitle(int A) {
		StringBuilder result = new StringBuilder();
		while(A > 0) {
			int rem = A % 26;
			if(rem == 0) {
				result.insert(0, 'Z');
				A = A / 26 - 1;
			} else {
				char c = (char)(rem - 1 + 'A');
				result.insert(0, c);
				A /= 26;
			}
		}
		return result.toString();
	}
}
