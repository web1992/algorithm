package cn.web1992.algorithm.leetcode.字符串;

import java.util.HashSet;
import java.util.Set;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions-easy/xnmav1/}
 */
public class 最长公共前缀2 {

    public static void main(String[] args) {

        String s = "a";

        System.out.println(s.substring(0, 1));

        String[] ss = new String[]{"ab", "a"};
        String s1 = new Solution().longestCommonPrefix(ss);
        System.out.println(s1);
    }

    static class Solution {

        public String longestCommonPrefix(String[] strs) {


            if (null == strs || strs.length == 0) {
                return "";
            }

            String ss = strs[0];
            int i = 1;

            while (i < strs.length) {
                while (strs[i].indexOf(ss) != 0) {
                    ss = ss.substring(0, ss.length() - 1);
                }
                i++;
            }

            return ss;

        }
    }

}
