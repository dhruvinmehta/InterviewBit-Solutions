/**
 * https://www.interviewbit.com/problems/hotel-bookings-possible/
 *
 * @author Dhruvin Mehta
 */
public class Solution {
	public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
		int activeUsers = 0;
		List<Point> events = new ArrayList<>();
		for(int i=0; i<arrive.size(); i++) {
			events.add(new Point(arrive.get(i), 1));
			events.add(new Point(depart.get(i), 0));
		}

		Collections.sort(events, new Comparator<Point>(){
			public int compare(Point p1, Point p2) {
				if(p1.x != p2.x) {
					return p1.x - p2.x;
				} else {
					return p1.y - p2.y;
				}
			}
		});

		for(Point event : events) {
			if(event.y == 1) {
				activeUsers++;
				if(activeUsers > K) return false;
			} else {
				activeUsers--;
			}
		}
		return true;
	}
}

class Point {
	int x;
	int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
