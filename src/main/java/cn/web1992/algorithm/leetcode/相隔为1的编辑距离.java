package cn.web1992.algorithm.leetcode;

/**
 * @author web1992
 * @date 2022/6/21  09:47
 * @link {https://www.bilibili.com/video/BV1eN4y137Sz}
 * @link {https://leetcode.cn/problems/one-edit-distance/}
 */
public class 相隔为1的编辑距离 {

    public static void main(String[] args) {

        String s = "abc";
        String t = "abcd";
        boolean ans = new Solution().oneEditDistance(s, t);
        System.out.println("ans=" + ans);
    }

    static class Solution {

        public boolean oneEditDistance(String s, String t) {

            int sLen = s.length();
            int tLen = t.length();

            if (sLen < tLen) {
                return oneEditDistance(t, s);
            }

            if (sLen - tLen > 1) {
                return false;
            }

            for (int i = 0; i < tLen; i++) {
                // 存在不相等的字符
                if (s.charAt(i) != t.charAt(i)) {
                    if (sLen == tLen) {// 替换
                        return s.charAt(i + 1) == t.charAt(i + 1);
                    } else {
                        // sLen- tLen == 1
                        // abdc -> abc
                        return s.charAt(i + 1) == t.charAt(i);
                    }
                }
            }

            // 没有不相等的字符
            return sLen == tLen + 1;
        }
    }
}
