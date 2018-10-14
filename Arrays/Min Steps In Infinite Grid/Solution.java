/**
 * https://www.interviewbit.com/problems/min-steps-in-infinite-grid/
 *
 * @author Dhruvin Mehta
 */
public class Solution {
    public int coverPoints(int[] A, int[] B) {
        int result = 0;
        for(int i=0; i<A.length - 1; i++) {
            int XDiff = Math.abs(A[i] - A[i + 1]);
            int YDiff = Math.abs(B[i] - B[i + 1]);

            result += Math.max(XDiff, YDiff);
        }
        return result;
    }
}
