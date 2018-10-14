/**
 * https://www.interviewbit.com/problems/next-permutation/
 *
 * @author Dhruvin Mehta
 */
public class Solution {
	public void nextPermutation(ArrayList<Integer> a) {
		int index = 0;
		int size = a.size();

		for(index = size - 1; index > 0; index--) {
			if(a.get(index) > a.get(index - 1)) {
				break;
			}
		}

		if(index == 0) {
			Collections.sort(a);
			return;
		}

		int low = index - 1;
		int high = index;
		int min = a.get(low);
		int max = a.get(high);

		for(int i = size - 1; i > index; i--) {
			if(a.get(i) > min && a.get(i) < max) {
				high = i;
				max = a.get(i);
			}
		}

		int temp = a.get(high);
		a.set(high, a.get(low));
		a.set(low, temp);
		low++;
		Collections.sort(a.subList(low, size));
	}
}
