
package cn.web1992.algorithm.leetcode.test;

import cn.web1992.algorithm.arrays.ArraysTest;

/**
 * @link {https://programmercarl.com/0516.%E6%9C%80%E9%95%BF%E5%9B%9E%E6%96%87%E5%AD%90%E5%BA%8F%E5%88%97.html#%E6%80%9D%E8%B7%AF}
 */
public class 最长回文子序列Test02 {

    public static void main(String[] args) {

        Solution solution = new Solution();
        int ans = solution.longestPalindromeSubseq("aabbcc");
        System.out.println("ans=" + ans);
    }

    static class Solution {
        public int longestPalindromeSubseq(String s) {

            int len = s.length();
            int[][] dp = new int[len + 1][len + 1];
            for (int i = 0; i < len; i++) {
                dp[i][i] = 1;
            }

            // dp[i][j]= i=j ? (dp[i+1][j-1]) :( Max(dp[i+1][j],dp[i][j-1]) )
            for (int i = len - 1; i >= 0; i--) {
                for (int j = i + 1; j < len; j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        dp[i][j] = dp[i + 1][j - 1] + 2;
                    } else {
                        dp[i][j] = Math.max(Math.max(dp[i + 1][j], dp[i][j - 1]), dp[i][j]);
                    }
                    ArraysTest.printArray(dp);
                    ArraysTest.printArraySplit(dp);
                }
            }

            return dp[0][len - 1];
        }
    }
}
