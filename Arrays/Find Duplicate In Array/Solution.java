/**
 * https://www.interviewbit.com/problems/find-duplicate-in-array/
 *
 * @author Dhruvin Mehta
 */
public class Solution {
	// DO NOT MODIFY THE LIST
	public int repeatedNumber(final List<Integer> a) {
		List<Boolean> visited = new ArrayList<>();
		for(int i=0; i<a.size(); i++) {
			visited.add(false);
		}

		for(int i=0; i<a.size(); i++) {
			if(!visited.get(a.get(i))) {
				visited.set(a.get(i), true);
			} else {
				return a.get(i);
			}
		}
		return -1;
	}
}
