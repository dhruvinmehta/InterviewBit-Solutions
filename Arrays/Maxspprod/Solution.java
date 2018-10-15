/**
 * https://www.interviewbit.com/problems/maxspprod/
 *
 * @author Dhruvin Mehta
 */
public class Solution {
	public int maxSpecialProduct(ArrayList<Integer> A) {
		int size = A.size();
		long maxProduct = Long.MIN_VALUE;

		int[] left = firstGreaterNum(A, true);
		int[] right = firstGreaterNum(A, false);

		for(int i = 0; i < size; i++) {
			long result = (long) left[i] * (long) right[i];
			maxProduct = Math.max(result, maxProduct);
		}

		return (int)(maxProduct % 1000000007);
	}

	public int[] firstGreaterNum(ArrayList<Integer> A, boolean forward) {
		int[] result = new int[A.size()];
		Stack<Integer> stack = new Stack<>();

		int index = A.size() - 1;
		int incr = -1;

		if(forward) {
			index = 0;
			incr = 1;
		}

		while(index >= 0 && index < A.size()) {
			while (!stack.empty() && A.get(index) >= A.get(stack.peek())) {
				stack.pop();
			}
			
			if(stack.empty()) {
				result[index] = 0;
			} else {
				result[index] = stack.peek();
			}
			stack.push(index);
			index += incr;
		}
		return result;
	}
}
