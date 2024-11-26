import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class q56合并区间 {
    class Solution {
        public int[][] merge(int[][] intervals) {

            Arrays.sort(intervals,(a,b) -> a[0] - b[0]);
            List<int[]> ans = new ArrayList<>();
            for(int [] p : intervals){
                int n = ans.size();
                if(n>0 && p[0]<=ans.get(n-1)[1]){
                    ans.get(n-1)[1] = Math.max(p[1],ans.get(n-1)[1]);
                }else{
                    ans.add(p);
                }

            }
            return ans.toArray(new int[ans.size()][]);

        }
    }
}
