package cn.web1992.algorithm.leetcode.字符串;


/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions-easy/xn96us/}
 */
public class 有效的字母异位词2 {
    public static void main(String[] args) {

    }

    static class Solution {

        public boolean isAnagram(String s, String t) {

            if (s.length() != t.length()) {
                return false;
            }

            char[] char1 = new char[26];
            char[] char2 = new char[26];

            for (int i = 0; i < s.length(); i++) {
                char1[s.charAt(i) - 'a']++;
            }

            for (int i = 0; i < t.length(); i++) {
                char2[t.charAt(i) - 'a']++;
            }

            for (int i = 0; i < char1.length; i++) {
                if (char1[i] != char2[i]) {
                    return false;
                }
            }

            return true;
        }
    }
}
