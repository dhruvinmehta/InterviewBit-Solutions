/**
 * https://www.interviewbit.com/problems/merge-intervals/
 *
 * @author Dhruvin Mehta
 */
public class Solution {
	public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
		ArrayList<Interval> result = new ArrayList<>();
		boolean merged = false;
		boolean added = false;
		int size = intervals.size();
		int i = 0;

		for(i = 0; i < size; i++) {
			Interval interval = intervals.get(i);
			if(checkIfOverlapping(interval, newInterval)) {
				merged = true;
				newInterval.start = Math.min(interval.start, newInterval.start);
				newInterval.end = Math.max(interval.end, newInterval.end);
			} else if(merged) {
				result.add(new Interval(newInterval.start, newInterval.end)); 
				added = true;
				break;
			} else {
				result.add(interval);
			}
		}

		if(i < size) {
			for(; i < size; i++) {
				result.add(intervals.get(i));
			}
		}

		if(!added) {
			result.add(new Interval(newInterval.start, newInterval.end));
			Collections.sort(result, (Interval i1, Interval i2)  -> i1.start - i2.start);
		}
		return result;
	}

	public boolean checkIfOverlapping(Interval i1, Interval i2) {
		if(i1.start < i2.start) {
			return i1.start <= i2.start && i2.start <= i1.end;
		} else {
			return i2.start <= i1.start && i1.start <= i2.end;
		}
	}
}

// Definition for an interval.
class Interval {
	int start;
	int end;
	Interval() { start = 0; end = 0; }
	Interval(int s, int e) { start = s; end = e; }
}

