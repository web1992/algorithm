package cn.web1992.algorithm.leetcode.字符串;

import java.util.HashMap;
import java.util.Map;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions-easy/xn5z8r/}
 */
public class 字符串中的第一个唯一字符 {

    public static void main(String[] args) {

    }

    static class Solution {
        public int firstUniqChar(String s) {

            char[] chArr = s.toCharArray();
            Map<Character, Integer> map = new HashMap<>();
            for (char c : chArr) {
                map.merge(c, 1, Integer::sum);
            }

            for (int i = 0; i < s.length(); i++) {
                if (map.get(s.charAt(i)) == 1) {
                    return i;
                }
            }

            return -1;
        }
    }
}
