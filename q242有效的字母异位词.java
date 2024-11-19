import java.util.HashMap;
import java.util.Map;

public class q242有效的字母异位词 {
    class Solution {
        public boolean isAnagram(String s, String t) {
            int[] cnt = new int[26];
            char[] chars = s.toCharArray();
            char[] chart = t.toCharArray();
            int lens = chars.length;
            int lent = chart.length;
            if(lent!=lens){
                return false;
            }
            for(char c:chars){
                cnt[c - 'a']++;
            }
            for(char c:chart){
                cnt[c - 'a']--;
            }
            for (int x:cnt){
                if (x!=0){
                    return false;
                }
            }
            return true;



        }
    }
}
