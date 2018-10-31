/**
 * https://www.interviewbit.com/problems/grid-unique-paths/
 *
 * @author Dhruvin Mehta
 */
public class Solution {
	public int uniquePaths(int A, int B) {
		int[][] paths = new int[A][B];
		for(int i = 0; i < B; i++) {
			paths[0][i] = 1;
		}

		for(int j = 0; j < A; j++) {
			paths[j][0] = 1;
		}

		for(int i = 1; i < A; i++) {
			for(int j = 1; j < B; j++) {
				paths[i][j] = paths[i - 1][j] + paths[i][j - 1];
			}
		}
		return paths[A - 1][B - 1];
	}
}
