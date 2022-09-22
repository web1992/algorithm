package cn.web1992.algorithm.leetcode.字符串;

import java.util.HashMap;
import java.util.Map;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions-easy/xn96us/}
 */
public class 有效的字母异位词 {
    public static void main(String[] args) {

    }

    static class Solution {

        public boolean isAnagram(String s, String t) {

            if (s.length() != t.length()) {
                return false;
            }

            Map<Character, Integer> mapS = new HashMap<>();
            Map<Character, Integer> mapT = new HashMap<>();

            for (char c : s.toCharArray()) {
                mapS.merge(c, 1, Integer::sum);
            }

            for (char c : t.toCharArray()) {
                mapT.merge(c, 1, Integer::sum);
            }

            for (Character ch : mapS.keySet()) {
                if (null == mapT.get(ch) || !mapT.get(ch).equals(mapS.get(ch))) {
                    return false;
                }
            }
            return true;
        }
    }
}
