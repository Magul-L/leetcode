import java.util.Arrays;
import java.util.Comparator;

public class q452用最少数量的箭引爆气球 {
    class Solution {
        public int findMinArrowShots(int[][] points) {
            int n = points.length;
            Arrays.sort(points, Comparator.comparingInt(p -> p[1]));
            int ans =0;
            long pre = Long.MIN_VALUE;
            for (int[] p : points) {
                if (p[0] > pre) { // 上一个放的点在区间左边
                    ans++;
                    pre = p[1]; // 在区间的最右边放一个点
                }
            }
            return ans;

        }
    }

}
