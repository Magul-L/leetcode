import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class q57插入区间 {
//    class Solution {
//        public int[][] insert(int[][] intervals, int[] newInterval) {
//            List<int[]> ans = new ArrayList<>();
//            int[][] merged = new int[intervals.length+1][];
//            System.arraycopy(intervals,0,merged,0,intervals.length);
//            merged[intervals.length] = newInterval;
//            Arrays.sort(merged,(a,b) -> a[0] - b[0]);
//            for(int [] p : merged){
//                int n = ans.size();
//                if(n>0 && p[0]<=ans.get(n-1)[1]){
//                    ans.get(n-1)[1] = Math.max(p[1],ans.get(n-1)[1]);
//                }else{
//                    ans.add(p);
//                }
//
//            }
//            return ans.toArray(new int[ans.size()][]);
//        }
//    }
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int left = newInterval[0];
        int right = newInterval[1];
        boolean placed = false;
        List<int[]> ansList = new ArrayList<int[]>();
        for (int[] interval : intervals) {
            if (interval[0] > right) {
                // 在插入区间的右侧且无交集
                if (!placed) {
                    ansList.add(new int[]{left, right});
                    placed = true;
                }
                ansList.add(interval);
            } else if (interval[1] < left) {
                // 在插入区间的左侧且无交集
                ansList.add(interval);
            } else {
                // 与插入区间有交集，计算它们的并集
                left = Math.min(left, interval[0]);
                right = Math.max(right, interval[1]);
            }
        }

    }
}


}
