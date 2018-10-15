/**
 * https://www.interviewbit.com/problems/triplets-with-sum-between-given-range/
 *
 * @author Dhruvin Mehta
 */
public class Solution {
	public int solve(ArrayList<String> A) {
		double twoThird = 2.0 / 3.0;
		double one = 1.0;

		List<Double> first = new ArrayList<>();
		List<Double> second = new ArrayList<>();
		List<Double> third = new ArrayList<>();

		List<Double> numbers = new ArrayList<>();
		
		for(String num : A) {
			double temp = Double.parseDouble(num);
			if(temp < 2) {
				numbers.add(temp);
			}
		}

		for(Double num : numbers) {
			if(num <= twoThird) {
				first.add(num);
			} else if(num <= one) {
				second.add(num);
			} else {
				third.add(num);
			}
		}

		double firstMax1 = max(first, 2);
		double firstMax2 = max(first, firstMax1);
		double firstMax3 = max(first, firstMax2);

		double firstMin1 = min(first, -1);
		double firstMin2 = min(first, firstMin1);

		double secondMin1 = min(second, -1);
		double secondMin2 = min(second, secondMin1);

		double thirdMin1 = min(third, -1);

		if(first.size() >= 3 && firstMax1 +  firstMax2 + firstMax3 > 1) {
			return 1;
		} else if(first.size() >= 2 && second.size() >= 1 && firstMax1 + firstMax2 + secondMin1 > 1 && firstMax1 + firstMax2 + secondMin1 < 2) {
			return 1;
		} else if(first.size() >= 2 && third.size() >= 1 && firstMin1 + firstMin2 + thirdMin1 < 2) {
			return 1;
		} else if(first.size() >= 1 && second.size() >= 2 && firstMin1 + secondMin1 + secondMin2 < 2) {
			return 1;
		} else if(first.size() >= 1 && second.size() >= 1 && third.size() >= 1 && firstMin1 + secondMin1 + thirdMin1 < 2) {
			return 1;
		} else {
			return 0;
		}
	}

	public double min(List<Double> numbers, double minValue) {
		double possibleMin = 2.0;
		for(Double num : numbers) {
			if(num < possibleMin && num > minValue) {
				possibleMin = num;
			}
		}
		return possibleMin;
	}

	public double max(List<Double> numbers, double maxValue) {
		double possibleMax = 0.0;
		for(Double num : numbers) {
			if(num > possibleMax && num < maxValue) {
				possibleMax = num;
			}
		}
		return possibleMax;
	}
}

