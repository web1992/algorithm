package cn.web1992.algorithm.leetcode.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * https://leetcode.cn/leetbook/read/top-interview-questions/xa503c/
 */
public class 单词拆分Test002 {

    public static void main(String[] args) {

        String str = "applepenapple";
        List<String> wordDict = Arrays.asList("apple", "pen");
        boolean ans = new Solution().wordBreak(str, wordDict);
        System.out.println(ans);
    }

    static class Solution {

        public boolean wordBreak(String s, List<String> wordDict) {

            int len = s.length();
            Set<String> set = new HashSet<>(wordDict);
            boolean[] dp = new boolean[len + 1];
            dp[0] = true;

            for (int i = 1; i <= len; i++) {
                for (int j = 0; j < i; j++) {
                    if (dp[j] && set.contains(s.substring(j, i))) {
                        dp[i] = true;
                        break;
                    }
                }
            }
            return dp[len];
        }

    }

}
