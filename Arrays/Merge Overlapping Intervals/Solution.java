/**
 * https://www.interviewbit.com/problems/merge-overlapping-intervals/
 *
 * @author Dhruvin Mehta
 */
public class Solution {
	public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
		Collections.sort(intervals, (Interval i1, Interval i2)  -> i1.start - i2.start);
		ArrayList<Interval> result = new ArrayList<>();        
		int low = intervals.get(0).start;
		int high = intervals.get(0).end;

		for(int i=1; i<intervals.size(); i++) {
			if(high >= intervals.get(i).start) {
				low = Math.min(low, intervals.get(i).start);
				high = Math.max(high, intervals.get(i).end);
			} else {
				result.add(new Interval(low, high));
				low = intervals.get(i).start;
				high = intervals.get(i).end;
			}
		}
		result.add(new Interval(low, high));
		return result;
	}
}

// Definition for an interval.
class Interval {
	int start;
	int end;
	Interval() { start = 0; end = 0; }
	Interval(int s, int e) { start = s; end = e; }
}
