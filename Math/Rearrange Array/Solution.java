/**
 * https://www.interviewbit.com/problems/rearrange-array/
 *
 * @author Dhruvin Mehta
 */
public class Solution {
	public void arrange(ArrayList<Integer> a) {
		int size = a.size();
		for(int i = 0; i < size; i++) {
			int temp = a.get(i) + (a.get(a.get(i)) % size) * size; 
			a.set(i, temp);
		}

		for(int i = 0; i < size; i++) {
			int temp = a.get(i) / size;
			a.set(i, temp);
		}
	}
}
