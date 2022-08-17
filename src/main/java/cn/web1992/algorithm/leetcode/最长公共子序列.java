package cn.web1992.algorithm.leetcode;

/**
 * @link {https://leetcode.cn/problems/longest-common-subsequence/}
 * @Link {https://programmercarl.com/1143.%E6%9C%80%E9%95%BF%E5%85%AC%E5%85%B1%E5%AD%90%E5%BA%8F%E5%88%97.html#_1143-%E6%9C%80%E9%95%BF%E5%85%AC%E5%85%B1%E5%AD%90%E5%BA%8F%E5%88%97}
 */
public class 最长公共子序列 {

    public static void main(String[] args) {

        String text1 = "abcde", text2 = "ace";

        int ans = new Solution().longestCommonSubsequence(text1, text2);
        System.out.println(ans);
    }

    /**
     * 输入：text1 = "abcde", text2 = "ace"
     * 输出：3
     * 解释：最长公共子序列是 "ace" ，它的长度为 3 。
     */
    static class Solution {

        public int longestCommonSubsequence(String text1, String text2) {

            int len1 = text1.length();
            int len2 = text2.length();
            int[][] dp = new int[len1 + 1][len2 + 1];

            for (int i = 1; i <= len1; i++) {
                for (int j = 1; j <= len2; j++) {
                    if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;// i,j 指向的字符 相等=1
                    } else {
                        // i,j 指向的字符 不相等 ，不变
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                    }
                }
            }

            return dp[len1][len2];
        }
    }
}
