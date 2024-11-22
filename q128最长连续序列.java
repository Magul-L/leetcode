import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class q128最长连续序列 {
    class Solution {
        public int longestConsecutive(int[] nums) {
            int n = nums.length;
            Set<Integer> num_set = new HashSet<Integer>();
            for (int num : nums) {
                // 将数组中的每个整数添加到集合中，去除重复元素
                num_set.add(num);
            }
            int ans = 0;
            for(int num:num_set){
                if(!num_set.contains(num-1)){
                    int curnum =num;
                    int curans =1;
                    while(num_set.contains(curnum+1)){
                        curnum++;
                        curans++;
                    }
                    ans = Math.max(curans,ans);


                }
            }
            return ans;



        }
    }
}
