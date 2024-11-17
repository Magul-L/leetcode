import java.util.HashMap;
import java.util.Map;

public class q290单词规律 {
    class Solution {
        public boolean wordPattern(String pattern, String s) {
            Map<Character, String> map = new HashMap<>();
            char[] chars = pattern.toCharArray();
            String[] strings = s.split(" ");
            if (chars.length != strings.length)
                return false;
            for (int i = 0;i < chars.length;i++) {
                if (!map.containsKey(chars[i]) && !map.containsValue(strings[i]))
                    map.put(chars[i], strings[i]);
                else if (map.get(chars[i]) == null || !map.get(chars[i]).equals(strings[i]))
                    return false;
            }
            return true;
        }
    }
}
