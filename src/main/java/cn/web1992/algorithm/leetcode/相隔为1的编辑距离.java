package cn.web1992.algorithm.leetcode;

/**
 * @author web1992
 * @date 2022/6/21  09:47
 * @link {https://www.bilibili.com/video/BV1eN4y137Sz}
 * @link {https://leetcode.cn/problems/one-edit-distance/}
 * @link 相隔为1的编辑距离.png
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

            int sLen = s.length();// 较长的字符串
            int tLen = t.length();// 较短的字符串

            if (sLen < tLen) {
                return oneEditDistance(t, s);
            }

            if (sLen - tLen > 1) {
                return false;
            }

            for (int i = 0; i < tLen; i++) {
                // 存在不相等的字符
                if (s.charAt(i) != t.charAt(i)) {
                    // 找到了不相等的字符串了，
                    if (sLen == tLen) {
                        // s=abc,t=aac
                        // 二个字符串长度相等，但是第i个字符不相等，那么需要 替换
                        return s.charAt(i + 1) == t.charAt(i + 1);
                    } else {
                        // s= abdc, t=abc
                        // 二个字符串长度不相等，需要插入/删除
                        return s.charAt(i + 1) == t.charAt(i);
                    }
                }
            }

            // 没有不相等的字符
            return sLen == tLen + 1;
        }
    }
}
