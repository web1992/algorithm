package cn.web1992.algorithm.leetcode.字符串;


/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions-easy/xn5z8r/}
 */
public class 字符串中的第一个唯一字符2 {

    public static void main(String[] args) {

    }

    static class Solution {
        public int firstUniqChar(String s) {

            for (int i = 0; i < s.length(); i++) {
                if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                    return i;
                }
            }

            return -1;
        }
    }
}
