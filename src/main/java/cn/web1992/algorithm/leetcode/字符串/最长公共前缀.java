package cn.web1992.algorithm.leetcode.字符串;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions-easy/xnmav1/}
 */
public class 最长公共前缀 {

    public static void main(String[] args) {

        String s = "a";

        System.out.println(s.substring(0, 1));

        String[] ss = new String[]{"ab", "a"};
        String s1 = new Solution().longestCommonPrefix(ss);
        System.out.println(s1);
    }

    static class Solution {

        public String longestCommonPrefix(String[] strs) {

            int minLen = Integer.MAX_VALUE;
            for (String str : strs) {
                minLen = Math.min(str.length(), minLen);
            }
            //System.out.println(minLen);

            int len = 1;
            int maxLen = 0;
            while (len <= minLen) {

                Set<String> temList = new HashSet<>();
                for (String str : strs) {
                    String s1 = str.substring(0, len);
                    temList.add(s1);
                }

                if (temList.size() == 1) {
                    maxLen = len;
                }
                len++;
            }
            return maxLen == 0 ? "" : strs[0].substring(0, maxLen);
        }
    }

}
