package cn.web1992.algorithm.leetcode;

/**
 * @link {https://leetcode.cn/problems/longest-palindromic-subsequence/}
 * @link {https://programmercarl.com/0516.%E6%9C%80%E9%95%BF%E5%9B%9E%E6%96%87%E5%AD%90%E5%BA%8F%E5%88%97.html#_516-%E6%9C%80%E9%95%BF%E5%9B%9E%E6%96%87%E5%AD%90%E5%BA%8F%E5%88%97}
 */
public class 最长回文子序列 {

    public static void main(String[] args) {
        String str = "bbbab";
        int ans = new Solution().longestPalindromeSubseq(str);
        System.out.println(ans);
    }

    static class Solution {

        public int longestPalindromeSubseq(String s) {

            int len = s.length();

            int[][] dp = new int[len][len];

            for (int i = len - 1; i >= 0; i--) {
                dp[i][i] = 1;
                for (int j = i + 1; j < len; j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        dp[i][j] = dp[i + 1][j - 1] + 2;
                    } else {
                        dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                    }
                }
            }

            return dp[0][len - 1];
        }
    }
}
