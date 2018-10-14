/**
 * https://www.interviewbit.com/problems/spiral-order-matrix-ii/
 *
 * @author Dhruvin Mehta
 */
public class Solution {
	public int[][] generateMatrix(int A) {
		int col_start = 0;
		int row_start = 0;

		int row_end = A;
		int col_end = A;

		int[][] result = new int[A][A];
		int elements = row_end * col_end;

		int index = 1;
		while(index <= A * A) {
			for(int i = col_start; i < col_end; i++) {
				result[row_start][i] = index++;
			}
			row_start++;

			for(int i = row_start; i < row_end; i++) {
				result[i][col_end - 1] = index++;
			}
			col_end--;

			for(int i = col_end; i > col_start && row_end > row_start; i--) {
				result[row_end - 1][i - 1] = index++;
			}
			row_end--;

			for(int i = row_end; i > row_start && col_end > col_start; i--) {
				result[i - 1][col_start] = index++;
			}
			col_start++;
		}
		return result;
	}
}
