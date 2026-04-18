/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
       Collections.sort(intervals, (a, b) -> a.start - b.start);
       int i = 0;
       while(i<intervals.size()-1){
         Interval curr = intervals.get(i);
         Interval next = intervals.get(i+1);
         if(curr.end > next.start){
            return false;
         }
         i++;
       }
       return true;
    }
}
