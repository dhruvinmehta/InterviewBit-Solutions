/**
 * https://www.interviewbit.com/problems/find-permutation/
 *
 * @author Dhruvin Mehta
 */
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> findPerm(final String A, int B) {
        ArrayList<Integer> result = new ArrayList<>();
        int length = A.length();
        int num1 = 0;
        int num2 = 0;
        
        for(int i=0; i<length; i++) {
            if(A.charAt(i) == 'I') {
                num1++;
            }
        }
        
        num1 = B - num1;
        num2 = num1 - 1;
        
        for(int i=0; i<length; i++) {
            if(A.charAt(i) == 'I') {
                result.add(num1);
                num1++;
            } else {
                result.add(num2);
                num2--;
            }
        }
        return result;
    }
}
