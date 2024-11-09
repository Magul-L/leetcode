import java.util.ArrayList;
import java.util.List;

public class q54 {
    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            if (matrix.length == 0)
                return new ArrayList<Integer>();
            List<Integer> ans = new ArrayList<>();
            int l = 0, r = matrix[0].length - 1, t = 0, b = matrix.length - 1;
            while(l <= r && t <= b){
                for(int i=l;i<=r;i++){
                    ans.add(matrix[t][i]);
                }
                t++;
                for (int i=t;i<=b;i++){
                    ans.add(matrix[i][r]);
                }
                r--;
                //*********** 检查是否还需要继续处理(重要)************
                if (t <= b) {
                    // 从右到左
                    for (int i = r; i >= l; i--) {
                        ans.add(matrix[b][i]);
                    }
                    b--;
                }

                if (l <= r) {
                    // 从下到上
                    for (int i = b; i >= t; i--) {
                        ans.add(matrix[i][l]);
                    }
                    l++;
                }
            }


            return ans;
        }
    }

}
