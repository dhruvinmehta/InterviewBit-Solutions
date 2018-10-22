/**
 * https://www.interviewbit.com/problems/excel-column-number/
 *
 * @author Dhruvin Mehta
 */
public class Solution {
	public int titleToNumber(String A) {
		int column = 0;
		for(int i = 0; i < A.length(); i++) {
			char c = A.charAt(i);
			column *= 26;
			column += c - 'A' + 1;
		}
		return column;
	}
}
