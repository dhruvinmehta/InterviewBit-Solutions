/**
 * https://www.interviewbit.com/problems/largest-number/
 *
 * @author Dhruvin Mehta
 */
public class Solution {
	// DO NOT MODIFY THE LIST. IT IS READ ONLY
	public String largestNumber(final List<Integer> A) {
		StringBuilder result = new StringBuilder();
		Collections.sort(A, new Comparator<Integer>() {
			public int compare(Integer a, Integer b) {
				String ab = Integer.toString(a) + Integer.toString(b);
				String ba = Integer.toString(b) + Integer.toString(a);
				return ba.compareTo(ab);
			}
		});

		if(A.get(0) == 0) {
			return "0";
		}

		for(Integer num : A) {
			result.append(num);
		}
		return result.toString();
	}
}
