import java.util.HashMap;
import java.util.Map;

public class q219存在重复元素2 {
    class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            Map<Integer, Integer> map  = new HashMap<>();
            int n =  nums.length;
            for (int i = 0;i<n;i++){
                if(map.containsKey(nums[i])&&Math.abs(map.get(nums[i])-i)<=k){
                    return true;
                }
                map.put(nums[i],i );
            }
            return false;
        }
    }
}
